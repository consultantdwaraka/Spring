package com.spring.security.demo.springbasicsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration @EnableWebSecurity public class HttpSecurityConfig
    extends WebSecurityConfigurerAdapter {
    @Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("test").password(passwordEncoder().encode("test"))
            .roles("USER");
    }

    @Override protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().anyRequest().authenticated();
    }

    @Bean public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
