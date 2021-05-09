FROM openjdk:11
EXPOSE 8050
ADD target/test-docker.jar test-docker.jar
ENTRYPOINT ["java", "-jar", "/test-docker.jar"]