package com.practice.demowiki.service;

import com.practice.demowiki.domain.Ebook;
import com.practice.demowiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(){
        return ebookMapper.selectByExample(null);
    }
}
