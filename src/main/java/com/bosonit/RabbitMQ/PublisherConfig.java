package com.bosonit.RabbitMQ;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class PublisherConfig {

    @Value("${bosonit.queue.name}")
    private String message;

@Bean
    public Queue queue (){
    return new Queue(message,true);
}
}
