FROM openjdk:8

WORKDIR /opt/code
COPY . .
EXPOSE 80:8080
CMD ./gradlew bootRun