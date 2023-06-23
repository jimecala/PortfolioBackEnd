FROM amazoncorretto:11
EXPOSE 8080
MAINTAINER MJCA
COPY  target/BEmjca-0.0.1-SNAPSHOT.jar be_mjca.jar
ENTRYPOINT ["java","-jar","/be_mjca.jar"] 