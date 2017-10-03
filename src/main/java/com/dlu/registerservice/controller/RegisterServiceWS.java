package com.dlu.registerservice.controller;


import com.dlu.registerservice.config.RegisterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterServiceWS {


    @Autowired
    private RegisterConfig config;


    @GetMapping("/register/{name}")
    public String register(@PathVariable String name){
        return "Hello :" + config.getMessage();
    }

}
