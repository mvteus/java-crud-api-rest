FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
LABEL org.opencontainers.image.source=https://github.com/mvteus/java-crud-api-rest
