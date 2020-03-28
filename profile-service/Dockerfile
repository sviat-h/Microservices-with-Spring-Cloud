FROM openjdk:11
ADD target/docker-profile.jar docker-profile.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/docker-profile.jar"]