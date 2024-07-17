# Spring Boot 3 - Mybatis Demo

This is a demo project of Spring Boot 3 integration with Mybatis

### Tech Stack
+ Spring Boot 3
+ Mybatis
+ Lombok
+ Docker
+ Maven
+ Postman

### How to Setup

MySQL in Docker
```shell
docker run --name mybatis-demo -e MYSQL_ROOT_PASSWORD=yourpassword -p 3306:3306 --rm -d mysql:latest

```

Use Datagrip to create a schema called `mybtais-demo`


Deploy this project on local using IntelliJ

Import postman collection on the root dir and you can perform CRUD function.