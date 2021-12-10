package net.college.student.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hw")
    public String helloWorld() {
        return "Hello World to me!";
    }
}
