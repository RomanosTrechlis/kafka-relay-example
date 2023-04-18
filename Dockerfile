FROM openjdk:20-slim-buster

ARG JAR_FILE=build/libs/kafka-relay-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} kafka-relay.jar

ENTRYPOINT ["java", "-jar", "kafka-relay.jar"]