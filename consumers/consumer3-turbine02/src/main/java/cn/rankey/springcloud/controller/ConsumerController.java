package cn.rankey.springcloud.controller;

import cn.rankey.springcloud.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return helloRemote.hello(name);
    }
}
