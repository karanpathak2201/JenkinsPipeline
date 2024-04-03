FROM adoptopenjdk/openjdk11:jdk-11.0.8_10-debian-slim
EXPOSE 8080
ADD target/Spring-Boot-Docker.jar Spring-Boot-Docker.jar
ENTRYPOINT ["java","jar", "/Spring-Boot-Docker.jar"]