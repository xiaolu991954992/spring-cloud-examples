package cn.rankey.springcloud.controller;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello " +name+ ", this is first message by producer222";
    }
}
