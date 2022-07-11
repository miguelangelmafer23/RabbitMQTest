package com.bosonit.RabbitMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("test")
public class Controller {

    @Autowired
    private DemoService service;

    @GetMapping
    public void testSendMessage(){
        String message = "Mensaje #" + ThreadLocalRandom.current().nextInt();
        this.service.sentToRabbit(message);
    }
}
