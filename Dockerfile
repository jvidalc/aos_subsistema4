FROM openjdk:8-jdk-alpine
COPY prueba.jar prueba.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/prueba.jar"]