FROM openjdk:latest

CMD mkdir /app
WORKDIR /app

EXPOSE 8080
ADD target/blog-0.0.1-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

