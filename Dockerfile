FROM openjdk:17
COPY target\19_Product_MVC_CRUDs-0.0.1-SNAPSHOT.jar.original app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
