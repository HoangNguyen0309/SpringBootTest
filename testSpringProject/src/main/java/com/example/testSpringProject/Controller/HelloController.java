package com.example.testSpringProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/ahhhh")
    public String anotherTest() {
        System.out.println("another test?");
        return "this is another test";
    }
}
