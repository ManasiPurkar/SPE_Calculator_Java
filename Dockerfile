FROM maven:3.8.4-openjdk-11
WORKDIR /app
COPY . /app
RUN mvn clean install -X

