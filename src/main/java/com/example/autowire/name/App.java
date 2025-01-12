package com.example.autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowireByName.xml");

        com.example.autowire.name.car myCar = (com.example.autowire.name.car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
