FROM quay.io/eclipse/che-java8-maven:nightly

MAINTAINER tech-tejendra

USER root

COPY src /home/app/src
COPY pom.xml /home/app
#COPY application_docker.properties /home/app

#RUN mkdir -p /var/local/h2

RUN mvn -f /home/app/pom.xml -DskipTests=true -Dmaven.javadoc.skip=true clean package

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/home/app/target/spring-boot-h2-0.0.1-SNAPSHOT.jar"]

 