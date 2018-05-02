package com.example.helloservice;

import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

@RestController
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String home() {
        return "Hello Pivots!";
    }

    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name) {
        return String.format("Hello %s, you are in the Pivotal cloud!", name);
    }

    @GetMapping("/kill-instance")
    public void die()
    {
        log.error("Bye bye app-instance, RIP!");
        System.exit(-1);
    }
}

