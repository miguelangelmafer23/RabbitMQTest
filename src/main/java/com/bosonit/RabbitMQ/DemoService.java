package com.bosonit.RabbitMQ;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j

public class DemoService {
    @Autowired
    Publisher publisher;

    public void sentToRabbit(String message){
        log.info("Message '{}' will be send...", message);
        this.publisher.send(message);
    }
}


