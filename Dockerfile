# Use OpenJDK base image
FROM openjdk:17

# Set working directory inside container
WORKDIR /app

# Copy the jar file (assume already built using mvn clean package)
COPY target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
