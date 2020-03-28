FROM openjdk:11
ADD target/docker-account.jar docker-account.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/docker-account.jar"]