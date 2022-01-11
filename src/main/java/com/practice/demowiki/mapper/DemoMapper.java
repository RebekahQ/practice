package com.practice.demowiki.mapper;

import com.practice.demowiki.domain.Demo;
import com.practice.demowiki.domain.DemoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DemoMapper {
    long countByExample(DemoExample example);

    int deleteByExample(DemoExample example);

    int insert(Demo record);

    int insertSelective(Demo record);

    List<Demo> selectByExample(DemoExample example);

    int updateByExampleSelective(@Param("record") Demo record, @Param("example") DemoExample example);

    int updateByExample(@Param("record") Demo record, @Param("example") DemoExample example);
}