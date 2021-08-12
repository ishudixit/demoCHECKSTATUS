package com.example.demoCHECKSTATUS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontroller {
    @GetMapping("/hello")
        public String swagat(){
            return"good to see";
        }

}
