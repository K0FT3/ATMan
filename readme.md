# ATMan

Advanced task management tool built with Vue.js 2, Spring Boot 2, and MySQL 5.7+

## Local development setup

### Prerequisites

- JDK8 - OpenJDK  Preferred
- MySQL 5.7+
- RabbitMQ 3.6+
- GraphicMagick 1.3+

### Database setup

- Create database `atman`
- Initialize database with scripts in `setup` folder

### RabbitMQ setup on docker

- Init code `docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management`


### Add dev properties file

- Create `src/main/resources/application-dev.properties` with the following settings to override the settings in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/atman?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=<username>
spring.datasource.password=<password>
```

## Commands

- Use `mvn test` to run the tests of the back-end and the front-end
- Use `mvn spring-boot:run` to start the back-end
- Use `npm run serve` inside the `front-end` directory to start the front-end
- Use `mvn install` to build both the front-end and the back-end
- Use `java -jar target/app-0.0.1-SNAPSHOT.jar` to start the bundled application
