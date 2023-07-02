FROM openjdk:17-jdk-alpine
ADD app /app
WORKDIR /app
CMD ["javac", "Forever.java"]
CMD ["rm", "-rf", "Forever.java"]
CMD ["java", "Forever", "-cp", "lombok.jar"]
