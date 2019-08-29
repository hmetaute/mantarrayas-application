FROM openjdk:8-alpine

COPY target/uberjar/mantarrayas_backend.jar /mantarrayas_backend/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/mantarrayas_backend/app.jar"]
