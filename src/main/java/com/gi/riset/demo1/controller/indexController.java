package com.gi.riset.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping
public class indexController {

    @GetMapping
    public String index(){
        return "Helo World !<br>Cars REST API - "+new Date();
    }
}
