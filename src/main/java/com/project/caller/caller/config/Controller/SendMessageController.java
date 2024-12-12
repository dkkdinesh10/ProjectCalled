package com.project.caller.caller.config.Controller;

import com.project.caller.caller.config.Service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {

    @Autowired
    private SendService service;

    @PutMapping("/send/{message}")
    public void sendMessage(@PathVariable String message){
        service.sendMessage(message);
    }
}
