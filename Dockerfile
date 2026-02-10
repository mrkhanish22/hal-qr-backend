FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy everything
COPY . .

# Build the jar
RUN ./mvnw clean package -DskipTests

# Expose Spring Boot port
EXPOSE 8080

# Run the jar (Spring Boot creates only ONE jar)
CMD ["java", "-jar", "target/hal-0.0.1-SNAPSHOT.jar"]
