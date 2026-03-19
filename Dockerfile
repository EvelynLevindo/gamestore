# Estágio de compilação
## Uma imagem do Linux para compilar o projeto
FROM ubuntu:latest AS build 

## Instalar o Java 21
RUN apt-get update 
RUN apt-get install -y openjdk-21-jdk

## Instalar o Maven
RUN apt-get install -y Maven

## Copy do projeto para dentro do container
COPY . .

## Compilar o projeto com o Maven
RUN mvn clean install -DskipTests

## Execução do projeto
FROM eclipse-temurin:21-jdk-jammy

# Expor a porta 8080
EXPOSE 8080

## Copiar o arquivo JAR da compilação para o container de execução
COPY --from=build /target/gamestore-0.0.1-SNAPSHO.jar app.jar

## Definir o comando de inicialização do container
ENTRYPOINT ["java", "-jar", "app.jar"]