package com.springsecurity.oauth2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringSecurityOauthApp {

    @Bean
    public RestTemplate getResttemplate()
    {
        return new RestTemplate();
    }


    public static void main(String[] args) {


        SpringApplication.run(SpringSecurityOauthApp.class);
    }
}
