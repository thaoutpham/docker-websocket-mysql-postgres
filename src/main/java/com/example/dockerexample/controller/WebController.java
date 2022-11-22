package com.example.dockerexample.controller;


import com.example.dockerexample.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @MessageMapping("/user-all")
    @SendTo("/topic/user")
    public Message sendToAll(@Payload Message message) {
        Message message1 = new Message();
        message1.setName("Yến");
        message1.setMessage("Tớ Yêu Cậu");
        return message1;
    }

    @MessageMapping("/user-all/hello")
    @SendTo("/topic/user/hello")
    public Message sendTo(@Payload Message message) {
        Message message1 = new Message();
        message1.setName("Yến");
        message1.setMessage("Tớ Yêu Cậu");
        return message;
    }
}
