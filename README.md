# Subsistema 4. Gestión de notificaciones 🔔
Envío de **notificaciones** relacionadas con el funcionamiento del taller. 
Este subsistema es el encargado de notificar a los clientes el estado de los diferentes trabajos.

## 📋 Descripción del servicio de notificaciones

### Implementación
Hemos empleado la herramienta [swagger-codegen](https://github.com/swagger-api/swagger-codegen) para implementar nuestra API. En concreto usando el framework Spring Boot.

Hemos utilizado la imagen de mysql de Docker Hub como tecnología de persistencia de datos para nuestro servicio.

### Imagen Docker Hub

- [Link](https://hub.docker.com/repository/docker/jvidalc/aos_subsistema4_notificaciones)
- Imagen: `jvidalc/aos_subsistema4_notificaciones:latest`

>***NOTA***: 
>- `Debido a problemas de integración de la base de datos de nuestro servicio para el resto de grupos, hemos creado una versión de la imagen con un mock para las peticiones de la API` 


### Endpoints de la API de notificaciones

- /AOS4/notificacion
  - GET: Devuelve en un array todas las notificaciones de un cliente
  - POST: Crea una notificación especificando las propiedades requeridas.
  - OPTIONS: Proporciona la lista de los métodos HTTP soportados.

- /AOS4/notificacion/{notificacionId}
  - GET: Recupera una notificación específica identificada por su ID.
  - PUT: Modifica una notificación específica identificada por su ID.
  - DELETE: Elimina una notificación específica identificada por su ID.
  - OPTIONS: Proporciona la lista de los métodos HTTP soportados.


## ⚙️ Despliegue de todos los servicios del taller

   Al usar *docker* para instalar y ejecutar el servicio se deberá hacer uso del archivo `docker-compose.yml` disponible en el repositorio. A continuación se procederá a ejecutar el siguiente comando sobre su directorio:
```
docker-compose up
```
  De cara a la implementación del servicio en un cluster de kubernetes se puede tomar el archivo `kubernetes-deployment.yml`, el cual más adelante en este documento se muestra su estructura y en el que se detalla la implementación.

### Ruta
Frontend api
http://localhost:8080/AOS4/

### Link imagen docker en dockerHUB

https://hub.docker.com/repository/docker/jvidalc/aos_subsistema4_notificaciones

* Para ejecutar el servicio es necesario lanzar un contenedor independiente de mysql:

```yaml
version: "3"
services:

  ss4_notificaciones:
    image: jvidalc/aos_subsistema4_notificaciones
    ports:
      - "8083:8080"
    networks:
      - ss4-mysql
      - taller
    depends_on:
      - mysqldb

  mysqldb:
    image: mysql:8
    restart: always
    networks:
      - ss4-mysql
    environment:
      - MYSQL_ROOT_PASSWORD=qwerty
      - MYSQL_DATABASE=aos4
      - MYSQL_USER=qwerty
      - MYSQL_PASSWORD=qwerty
    volumes:
      - db_data:/var/lib/mysql
      - ./dbdump:/docker-entrypoint-initdb.d
    
networks:
  ss4-mysql:
  taller:

volumes:
  db_data:
``` 
