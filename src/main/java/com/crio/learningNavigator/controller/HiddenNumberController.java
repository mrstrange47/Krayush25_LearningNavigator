package com.crio.learningNavigator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiddenNumberController {
    @GetMapping("/hidden-feature/{number}")
    public String getNumberInfo(@PathVariable int number) {
        String apiUrl = "http://numbersapi.com/" + number;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
