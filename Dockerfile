FROM openjdk:8
EXPOSE 8050
ADD target/SpringGitJenkins.jar SpringGitJenkins.jar
ENTRYPOINT ["java", "-jar", "/SpringGitJenkins.jar"]