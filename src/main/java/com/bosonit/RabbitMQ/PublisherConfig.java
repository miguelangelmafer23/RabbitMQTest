package com.bosonit.RabbitMQ;


import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PublisherConfig {

    @Value("${bosonit.queue.name}")
    private String message;


}
