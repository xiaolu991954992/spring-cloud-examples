package cn.rankey.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${rankey.hello}")
    private String name;

    @RequestMapping("/hello")
    public String from(){
        return this.name;
    }
}
