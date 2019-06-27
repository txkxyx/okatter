# Okatter

## DB

database.sql

## Configration

```bash
$ vi src/main/resources/application.yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/okatter?useSSL=false&serverTimezone=JST
    username: Your User
    password: Your Password
    driverClassName: com.mysql.cj.jdbc.Driver
```

## Run

```bash
$ gradlew bootJar
```

## Access

[http://localhost:8080/](http://lcalhost:8080/)