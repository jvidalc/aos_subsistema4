FROM openjdk:8-jdk-alpine
COPY target/swagger-spring-1.0.0.jar main.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/main.jar"]