FROM openjdk:11-jdk-slim

WORKDIR /app

COPY target/my-application.jar /app/my-application.jar

EXPOSE 8080

CMD ["java", "-jar", "my-application.jar"]