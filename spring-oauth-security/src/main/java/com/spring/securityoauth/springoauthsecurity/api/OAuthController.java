package com.spring.securityoauth.springoauthsecurity.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController public class OAuthController {

    @GetMapping(value = "/hello-oauth") public @ResponseBody ResponseEntity<String> oauthTweet() {
        return new ResponseEntity<>("Oauth Sample response", HttpStatus.OK);
    }
}
