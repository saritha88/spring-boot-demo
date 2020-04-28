FROM openjdk:8-jdk-alpine
MAINTAINER Saritha Bolla
EXPOSE 9090
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]