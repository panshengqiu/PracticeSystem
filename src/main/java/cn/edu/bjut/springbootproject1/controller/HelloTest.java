package cn.edu.bjut.springbootproject1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 请求处理类
@RestController
public class HelloTest {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
