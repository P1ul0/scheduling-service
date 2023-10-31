FROM maven:3.9.4-eclipse-temurin-17-alpine AS builder

WORKDIR /jar

COPY . /jar

RUN mvn clean package -DskipTests

FROM eclipse-temurin:17-jre-alpine

WORKDIR /scheduling

COPY --from=builder /jar/target/*.jar ./scheduling.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "scheduling.jar"]