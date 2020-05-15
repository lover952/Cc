package com.cc.spring.cloud.server.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerConsumerApplication.class, args);
    }

}
