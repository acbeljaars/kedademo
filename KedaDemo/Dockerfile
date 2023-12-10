FROM openjdk:17
LABEL maintainer ="fq74jh"
EXPOSE 8082
ARG JAR_FILE=target/kedademo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]