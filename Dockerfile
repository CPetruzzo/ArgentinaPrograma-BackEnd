FROM amazoncorretto:11-alpine-jdk
MAINTAINER Facundo Wegher
COPY target/springboot-0.0.1-SNAPSHOT.jar fwportfolio.jar
ENTRYPOINT ["java","-jar","/fwportfolio.jar"]

