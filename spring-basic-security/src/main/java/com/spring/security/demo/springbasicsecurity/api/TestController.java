package com.spring.security.demo.springbasicsecurity.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String helloTweet(){
        return "Welcome to Spring boot rest controller!";
    }
}
