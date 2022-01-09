package com.practice.demowiki.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //返回字符串
//@Controller 返回页面
public class TestController {
// GET POST PUT DELETE 查询 新增 修改 删除 restful风格
// RequestMapping 支持所有请求，支持get 可以用@GetMapping
// 405 method 不支持

   // @RequestMapping("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "Hello World!";
    }
    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! POST."+name;
    }
}
