package com.example.springengineweb.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.w3c.dom.Node;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.HashMap;
import java.util.Map;


@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class AbcService {

    Map<String, Node> map = new HashMap<>();

    public AbcService() {
        System.out.println("ctor");
    }

    @PostConstruct
    public void springCtor() {
        // IO Resource -> open database connection
        System.out.println("spring ctor");
    }

    public void method() {
        System.out.println("\t\t >>> AbcService.method()");
    }


    @PreDestroy
    public void destroy() {
        // IO Resource -> close database connection
        System.out.println("destroy");
    }

}

@Configuration
class Config {

    // RestTemplate -> Rest Request
    // WebClient

}
