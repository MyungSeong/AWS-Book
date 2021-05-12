package com.kms.AWSBook.web;

import com.kms.AWSBook.web.dto.HelloResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDTO helloDTO(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount) {
        return new HelloResponseDTO(name, amount);
    }
}
