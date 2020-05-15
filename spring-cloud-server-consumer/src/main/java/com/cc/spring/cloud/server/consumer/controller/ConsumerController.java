package com.cc.spring.cloud.server.consumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
  private RestTemplate restTemplate;


    @RequestMapping("/ordr")
    public String consumerInfo(){
        String s="hello";
        String forObject = restTemplate.getForObject("http://EUREKA-SERVERSUPPORT/hello/hands?str=" + s, String.class);
        return forObject;
    }

}
