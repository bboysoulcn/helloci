FROM maven:3.6.3-jdk-8 as builder
WORKDIR /build/
COPY . /build
RUN mvn clean  package

FROM openjdk:8-jdk-alpine3.9 as runner
WORKDIR /jar
COPY --from=0 /build/target/helloci-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","helloci-0.0.1-SNAPSHOT.jar"]
