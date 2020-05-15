package com.cc.spring.cloud.eraka.server.support.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hands")
    public String reverseStr(String str){
        System.out.println("您输入的值为"+str);
        return "您输入的值为"+str;
    }
}
