package com.practice.demowiki.controller;

import com.practice.demowiki.domain.Ebook;
import com.practice.demowiki.resp.CommonResp;
import com.practice.demowiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")//返回字符串

//@Controller 返回页面
public class EbookController {


    @Resource
    private EbookService ebookService;

    //@RequestMapping(value = "/ebook/list",method = RequestMethod.GET)
    @GetMapping("/list")
    public CommonResp list(){
        CommonResp<List<Ebook> > resp = new CommonResp<>();
        List<Ebook> list = ebookService.list();
        resp.setContent(list);
        resp.setMessage("获取信息成功");
        return resp;
    }
}
