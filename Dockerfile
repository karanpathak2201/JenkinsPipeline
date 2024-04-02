FROM openjdk:11-alpine
EXPOSE 8080
ADD target/Spring-Boot-Docker.jar Spring-Boot-Docker.jar
ENTRYPOINT ["java","jar", "/Spring-Boot-Docker.jar"]