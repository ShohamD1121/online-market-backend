FROM eclipse-temurin:17-jdk-jammy
COPY target/product-service-1.0-SNAPSHOT.jar app.jar
ENV SPRING_PROFILES_ACTIVE=docker
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]