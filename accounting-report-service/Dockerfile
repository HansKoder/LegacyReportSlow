FROM eclipse-temurin:17-jdk-alpine

WORKDIR /accounting-report-service

COPY target/accounting-report-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
