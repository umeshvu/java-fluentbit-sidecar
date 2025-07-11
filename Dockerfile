FROM openjdk:17-slim
WORKDIR /app
COPY MainApp.java .
RUN javac MainApp.java
RUN mkdir logs
CMD ["java", "MainApp"]
