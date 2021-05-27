package com.example.demoerror.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/hello")
    public ResponseEntity<?> hello() {
        boolean isError = true;
        if (isError) {
            int a = 10/0;
        }
        return ResponseEntity.ok().body("hello");
    }
}
