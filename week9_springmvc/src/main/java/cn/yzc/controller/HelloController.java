package cn.yzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//控制器类 ->接收请求

@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello SpringMVC");
        return "success";
    }
}
