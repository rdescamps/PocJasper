FROM openjdk:8-jdk-alpine

LABEL maintainer="r.descamps.pro@gmail.com"

VOLUME /tmp

EXPOSE 8080

ARG JAR_FILE=target/JasperServer-0.0.1-SNAPSHOT.jar
ARG REPORTS=src/main/resources/reports
ARG REPORTSCOMP=src/main/resources/reportsCompile

ADD ${JAR_FILE} JasperServer-0.0.1-SNAPSHOT.jar
ADD ${REPORTS} src/main/resources/reports
ADD ${REPORTSCOMPILE} src/main/resources/reportsCompile
RUN apk add ttf-dejavu

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/JasperServer-0.0.1-SNAPSHOT.jar","-jrxml"]