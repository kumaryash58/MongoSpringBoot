FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/Practice-0.0.1-SNAPSHOT.jar Practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Practice-0.0.1-SNAPSHOT.jar"]
