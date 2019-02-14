FROM openjdk:8

EXPOSE 80:8080
WORKDIR /opt/code
COPY . .
CMD ./gradlew bootRun
