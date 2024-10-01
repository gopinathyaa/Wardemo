FROM openjdk:21
ADD target/jenkins-docker.jar /jenkins-docker.jar
ENTRYPOINT ["java","-jar","/jenkins-docker.jar"]
