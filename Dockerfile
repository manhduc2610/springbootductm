FROM openjdk:15
ADD target/spring-boot-docker.jar demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]

