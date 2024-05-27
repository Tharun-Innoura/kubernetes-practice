FROM azul/zulu-openjdk:21-jre-latest
VOLUME /tmp
COPY target/practice-0.0.1-SNAPSHOT.jar xyz.jar
EXPOSE 9090/tcp
ENTRYPOINT ["java","-jar","xyz.jar"]