package com.dioti.pussypointer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PussyController {

    @Autowired
    PussyController(){}

    @GetMapping("/images")
    public String getImage() {
        return "Testing";
    }
}
