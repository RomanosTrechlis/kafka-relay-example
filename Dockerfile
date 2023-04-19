FROM openjdk:20-slim-buster

ARG JAR_FILE=build/libs/kafka-relay-example-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} kafka-relay-example.jar

ENTRYPOINT ["java", "-jar", "kafka-relay-example.jar"]