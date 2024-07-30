package com.spring.core.DependencyInjection;

public class Client {
    public static void main(String[] args) {
        String message = "Greetings! Fellow Programmers!";
        SMSService smsService = new SMSService();
        EmailService emailService = new EmailService();
        MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(message);
    }
}
