package com.example.demoNitesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        MyService myService = context.getBean(MyService.class);

        myService.setLog("This is a message");
        myService.getLog();

    }
}
