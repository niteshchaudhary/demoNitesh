package com.example.demoNitesh;

import java.util.Date;

public class MyService {

    private String message;

    public void setLog(String message) {
        this.message = message;
    }

    public void getLog() {
        System.out.println("Inside my service: " +message);

    }

}
