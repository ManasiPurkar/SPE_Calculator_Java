FROM maven:3.8.4-openjdk-11
WORKDIR /app
COPY . /app
COPY ./target/SPE_Calculator_Java-1.0-SNAPSHOT.jar ./
CMD ["java", "-cp", "SPE_Calculator_Java-1.0-SNAPSHOT.jar", "org.example.Main"]


