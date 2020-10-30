FROM openjdk:11
ADD target/microservicesql-0.0.1-SNAPSHOT.jar microservicesql-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","microservicesql-0.0.1-SNAPSHOT.jar"]