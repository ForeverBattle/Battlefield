package com.lanou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    public String ribbon(String name) {
        System.out.println(name);
        return restTemplate.getForObject("http://user-service/hi?name="+name,String.class);
    }
}
