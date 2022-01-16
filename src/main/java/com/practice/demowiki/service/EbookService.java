package com.practice.demowiki.service;

import com.practice.demowiki.domain.Ebook;
import com.practice.demowiki.domain.EbookExample;
import com.practice.demowiki.mapper.EbookMapper;
import com.practice.demowiki.req.EbookReq;
import com.practice.demowiki.resp.EbookResp;
import com.practice.demowiki.util.CopyUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req){
        EbookExample ebookExample =new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebooksList = ebookMapper.selectByExample(ebookExample);

//        List<EbookResp> respList  =new ArrayList<>();
//        for (Ebook ebook : ebooksList) {
//            EbookResp ebookResp =  new EbookResp();
////            ebookResp.setId(ebook.getId());
//            BeanUtils.copyProperties(ebook,ebookResp);
//            respList.add(ebookResp);
//
//        }
        List<EbookResp> respList = CopyUtil.copyList(ebooksList, EbookResp.class);
        return  respList;
    }
}
