
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/docker-example-0.0.1-SNAPSHOT.jar

RUN mkdir /opt/docker-example

COPY ${JAR_FILE} /opt/docker-example/docker-example-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/opt/docker-example/docker-example-0.0.1-SNAPSHOT.jar"]