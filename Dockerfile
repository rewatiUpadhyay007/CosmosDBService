FROM openjdk:8
ADD target/CosmosDBService.jar CosmosDBService.jar
EXPOSE 9004
ENTRYPOINT ["java","-jar","CosmosDBService.jar"]