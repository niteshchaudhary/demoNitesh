package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.beans.MyBean;

public class HomeController {

    private MyBean myBean;

    @Autowired
    public void setMyBean(MyBean myBean) {
        this.myBean = myBean;
    }


}
