package com.spring.core.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements MessageService{
    @Override
    public void sendMessage(String message){
        System.out.println(message);;
    }
}
