package com.example.security.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 * @author liuhangfei
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/test")
    public String test(){
        return "success";
    }
}
