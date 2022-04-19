# Technologies
-SpringBoot
-RabbitMq
-Docker

# Docker Deployment

```
version: '3.1'
services:
  spboot-rabbitmq:
    image: rabbitmq:3-management
    ports:
      - '5672:5672'
      - '15672:15672'
    environment:
      - RABBITMQ_DEFAULT_USER=
      - RABBITMQ_DEFAULT_PASS=


```

# Application Properties
```
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=irfan
spring.rabbitmq.password=irfantest


sr.rabbit.queue.name = spring-rabbit-queue
sr.rabbit.exchange.name = spring-rabbit-exchange
sr.rabbit.routing.name = spring-rabbit-routing
```
