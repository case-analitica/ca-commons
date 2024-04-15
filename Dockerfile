FROM maven:3.8.1-openjdk-17-slim
COPY . .
RUN mvn clean package
COPY target/ca-commons-0.0.1.jar ca-commons-0.0.1.jar
ENTRYPOINT ["java","-jar","/ca-commons-0.0.1.jar"]

