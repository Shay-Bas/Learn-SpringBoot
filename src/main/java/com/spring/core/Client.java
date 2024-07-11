package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Vehicle vehicle = new Cycle();
//        Traveler traveler = new Traveler(vehicle);
//        traveler.startJourney();

        //Creating Spring IOC container
        //Read Configuration class AppConfig
        //Create and manage Spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve Spring Beans from IOC container
        Car car = applicationContext.getBean(Car.class);
        car.move();

        Traveler traveler = applicationContext.getBean(Traveler.class);
        traveler.startJourney();

    }
}
