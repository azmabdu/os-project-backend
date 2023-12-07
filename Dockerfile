FROM openjdk:17
VOLUME /tmp
WORKDIR /OS-project
EXPOSE 8080

COPY target/OS-project-1.0-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "/app.jar "]
