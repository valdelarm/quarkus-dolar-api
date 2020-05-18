# dolar-api project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application as docker container

you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

Then you can run `docker-compose up`