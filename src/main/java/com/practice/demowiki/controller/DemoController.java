package com.practice.demowiki.controller;

import com.practice.demowiki.domain.Demo;
import com.practice.demowiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/demo")//返回字符串

//@Controller 返回页面
public class DemoController {


    @Resource
    private DemoService demoService;

    //@RequestMapping(value = "/demo/list",method = RequestMethod.GET)
    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
