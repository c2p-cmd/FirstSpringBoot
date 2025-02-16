package org.thakur.helloworld.controllers;

import org.springframework.web.bind.annotation.*;
import org.thakur.helloworld.models.Message;

import java.util.Random;

@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping
    public Message index() {
        return new Message("Greetings from Spring Boot!", 0);
    }

    @GetMapping("/hello")
    public Message hello() {
        return new Message("Hello, World!", new Random().nextInt(100));
    }
}
