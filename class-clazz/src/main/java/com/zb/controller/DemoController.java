package com.zb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demos")
public class DemoController {

    @GetMapping
    public String demo(){
        return "classzz";
    }
}
