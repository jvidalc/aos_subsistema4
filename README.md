# Subsistema 4
Envío de **notificaciones** relacionadas con el funcionamiento del taller. 
Este subsistema es el encargado de notificar a los clientes el estado de los diferentes trabajos.

## Instalación y despliegue
   Al usar *docker* para instalar y ejecutar el servicio se deberá hacer uso del archivo `docker-compose.yml` disponible en el repositorio. A continuación se procederá a ejecutar el siguiente comando sobre su directorio:
```
docker-compose up
```
  De cara a la implementación del servicio en un cluster de kubernetes se puede tomar el archivo previamente mencionado en el que se detalla la implementación.
  ### Construcción de la imagen 
    docker build -t 'Nombre de la Imagen':'Tag de la Imagen'
  ### Creación del contenedor
    docker run -p 8083:8080 'Nombre de la imagen': 'Tag de la imagen'
  Posteriormente nos vamos al navegador y escribimos: 
    ``
      http://localhost:8083/api/v1/notificaciones
  	``
    ***NOTA***: 
    - `Nombre de la imagen:` nombre de la imagen local.
    - `Tag de la imagen:` tag de nuestra imagen (0.1)
### Ruta

Frontend api
http://localhost:8080/AOS4/

### Link imagen docker en dockerHUB

https://hub.docker.com/repository/docker/jvidalc/aos_subsistema4_notificaciones

* Para ejecutar el servicio es necesario lanzar un contenedor independiente de mysql:

```yaml
version: "3"
services:
  mysqldb:
    image: mysql:8
    restart: always
    networks:
      - spring-mysql
    environment:
      - MYSQL_ROOT_PASSWORD=qwerty
      - MYSQL_DATABASE=aos4
      - MYSQL_USER=qwerty
      - MYSQL_PASSWORD=qwerty
    volumes:
      - db_data:/var/lib/mysql
      - ./dbdump:/docker-entrypoint-initdb.d
      
  spring:
    image: jvidalc/aos_subsistema4_notificaciones
    ports:
      - "8080:8080"
    networks:
      - spring-mysql
    depends_on:
      - mysqldb

networks:
  spring-mysql:

volumes:
  db_data:
``` 


## Explicación del diseño de la API para la gestión de **Notificaciones**
### API segura: Autenticación
Hemos decidido crear dos tipos de autenticación mediante **JWT** (JSON Web Token) destinadas a funcionalidades distintas:
- **userToken:** para autorizar a los clientes registrados en el taller a consultar todas sus notificaciones o una en concreto.
- **subsystemToken:** para permitir al subsistema encargado de la gestión de trabajos crear una notificación si el estado de un trabajo cambia.

### Endpoints y métodos HTTP ###
Para la gestión de las notificaciones del taller se ha contemplado los siguientes Endpoints y métodos HTTP:

#### **/notificacion**
- **/notificacion - GET:** 
  Devuelve en un array todas las notificaciones de un cliente previamente autenticado.
  - **JWT** utilizado:
    - **userToken:**
  - Propiedades de cada una de las notificaciones recuperadas en el array:
    - notificacionId
    - clienteId
    - objetoTrabajo:
      - trabajoId
      - nombreTrabajo
      - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion - POST:** 
  Crea una notificación especificando las propiedades requeridas. 
  - **JWT** utilizado:
    - **subsystemToken:**
  - Campos json a especificar en la petición:
    - clienteId
    - trabajoId
    - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion - OPTIONS:**
  Proporciona la lista de los métodos HTTP soportados.
  - No requiere de autenticación.

#### **/notificacion/{notificacionId}**
- **/notificacion/{notificacionId} - GET:**
  Recupera una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **userToken:**
  - Parámetros requeridos:
    - notificaciónId
  - Propiedades de una notificación recuperada:
    - clienteId
    - objetoTrabajo:
      - trabajoId
      - nombreTrabajo
      - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion/{notificacionId} - PUT:**
  Modifica una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **subsystemToken:**
  - Parámetros requeridos:
    - notificaciónId
    - ETag del recurso que se desea modificar
  - Campos json a especificar en la petición:
    - clienteId
    - trabajoId
    - estadoTrabajo
    - fechaNotificacion
    - links (HATEOAS)
      - parent
      - self
- **/notificacion/{notificacionId} - DELETE:**
  Elimina una notificación específica identificada por su ID.
  - **JWT** utilizado:
    - **subsystemToken:**
  - Parámetros requeridos:
    - notificaciónId
- **/notificacion/{notificacionId} - OPTIONS:**
  Proporciona la lista de los métodos HTTP soportados.
  - No requiere de autenticación.
