FROM openjdk:8-jdk-alpine
COPY main.jar main.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/main.jar"]