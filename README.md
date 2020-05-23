# dolar-api project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application as docker container
```
Run ./mvnw package
```
then un `docker-compose up --build` and after the generation of the image and the container is up
you can run http://localhost:8080/swagger