# Use OpenJDK base image
FROM openjdk:17

# Set working directory inside container
WORKDIR /app

# Copy the jar file (assume already built using mvn clean package)
COPY target/19_Product_MVC_CRUDs-0.0.1-SNAPSHOT.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
