package com.jiansong.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/ post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }
}
