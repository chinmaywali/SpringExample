package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByType.xml");

        com.example.autowire.type.car myCar = (com.example.autowire.type.car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
