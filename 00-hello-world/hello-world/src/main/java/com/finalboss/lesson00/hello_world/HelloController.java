package com.finalboss.lesson00.hello_world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    @GetMapping("/")
    public String home() {
        return "Backend is running !!!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Boss";
    }
    
    
}
