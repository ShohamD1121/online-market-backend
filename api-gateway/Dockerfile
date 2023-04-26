FROM openjdk:17

COPY target/*.jar app.jar
COPY src/main/resources/application-docker.properties /app/config/application.properties

ENTRYPOINT ["java","-jar","/app.jar"]