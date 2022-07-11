package com.bosonit.RabbitMQ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @RabbitListener(queues = {"${bosonit.queue.name}"})
    public void receive (@Payload String message){
        
        log.info("Received message {} ", message);
        
        makeSlow();

    }

    private void makeSlow() {
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
