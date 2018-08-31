FROM openjdk:8-jre-alpine
COPY ./target/AdminBackendService-0.0.1-SNAPSHOT.jar /usr/src/adminservice/
WORKDIR /usr/src/adminservice/
EXPOSE 9006
CMD ["java","-jar","AdminBackendService-0.0.1-SNAPSHOT.jar"]