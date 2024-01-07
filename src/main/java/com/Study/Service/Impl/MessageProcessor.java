package com.Study.Service.Impl;


import com.Study.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
// Modified by developer branch
@Service
public class MessageProcessor {

    private final MessageService messageService;
    @Autowired
    public MessageProcessor(@Qualifier("simpleMessageService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(){
        String message = messageService.getMessage();
        System.out.println(message);
    }
}
