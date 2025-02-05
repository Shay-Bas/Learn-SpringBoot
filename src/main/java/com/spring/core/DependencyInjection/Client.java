package com.spring.core.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Greetings! Fellow Programmers!";
//        SMSService smsService = new SMSService();
//        EmailService emailService = new EmailService();
//        MessageSender messageSender = new MessageSender(emailService);
//        messageSender.sendMessage(message);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = applicationContext.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
