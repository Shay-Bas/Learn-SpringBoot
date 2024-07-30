package com.spring.core.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;

    //@Autowired: not required after spring 4.3 onwards if only one constructor in a class
    public MessageSender(@Qualifier("emailService") MessageService messageService){
        this.messageService = messageService;
    }

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService,@Qualifier("smsService") MessageService smsService){
        this.messageService = messageService;
        this.smsService = smsService;
    }

    public void sendMessage(String message){
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }

}
