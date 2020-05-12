# Spring Boot tests with TestContainers and PostgreSQL

## Overview
Use Testcontainers for integration testing with Spring Data JPA and the PostgreSQL database.

## Package the application

- Package the application

`$ ./mvnw clean package`

> To skip the tests use: `-DskipTests=true` 

## Run Application

`$ mvn spring-boot:run`

## Verify that postgres container is initialized

> Docker will pull the specified image and can be seen in Test logs.

```
2020-05-12 12:00:32.701  INFO 470540 --- [           main] org.testcontainers.DockerClientFactory   : Checking the system...
2020-05-12 12:00:32.702  INFO 470540 --- [           main] org.testcontainers.DockerClientFactory   : ✔︎ Docker server version should be at least 1.6.0
2020-05-12 12:00:32.828  INFO 470540 --- [           main] org.testcontainers.DockerClientFactory   : ✔︎ Docker environment should have more than 2GB free disk space
2020-05-12 12:00:32.874  INFO 470540 --- [           main] 🐳 [postgres:11.1]                       : Creating container for image: postgres:11.1
2020-05-12 12:00:33.655  INFO 470540 --- [           main] o.t.utility.RegistryAuthLocator          : Credential helper/store (docker-credential-desktop) does not have credentials for index.docker.io
2020-05-12 12:00:34.581  INFO 470540 --- [           main] 🐳 [postgres:11.1]                       : Starting container with ID: a77f81e6b7278138b8829bb907a2eed66ed9c03a4dcd905f3bcf51a6d841300a
2020-05-12 12:00:36.346  INFO 470540 --- [           main] 🐳 [postgres:11.1]                       : Container postgres:11.1 is starting: a77f81e6b7278138b8829bb907a2eed66ed9c03a4dcd905f3bcf51a6d841300a
2020-05-12 12:00:42.060  INFO 470540 --- [           main] 🐳 [postgres:11.1]                       : Container postgres:11.1 started in PT15.1360412S
2020-05-12 12:00:42.198  INFO 470540 --- [           main] org.testcontainers.ext.ScriptUtils       : Executing database script from initscript.sql
```