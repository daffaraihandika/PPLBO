package com.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @RequestMapping("/")
    @ResponseBody
    public String getIndex() {
        return "<h1>Hello World!!</h1>";
    }

    @RequestMapping("/welcome")
    @ResponseBody
    public String getWelComePage() {
        return "<h2>Welcome!</h2>";
    }
}
