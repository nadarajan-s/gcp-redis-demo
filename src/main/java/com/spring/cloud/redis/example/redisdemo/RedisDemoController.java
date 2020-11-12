package com.spring.cloud.redis.example.redisdemo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisDemoController {

    @Cacheable("hello")
    @GetMapping("/redis/{message}")
    public String getMessage(@PathVariable("message") String message){
        return "hello" + message;
    }

}
