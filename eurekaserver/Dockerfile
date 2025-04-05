# Use a lightweight JDK image for running the application
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/eureka-0.0.1-SNAPSHOT.jar app.jar

# Expose the application port
EXPOSE 8070

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]