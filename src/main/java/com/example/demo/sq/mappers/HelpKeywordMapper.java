package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HelpKeyword;

public interface HelpKeywordMapper {
    int deleteByPrimaryKey(Integer helpKeywordId);

    int insert(HelpKeyword record);

    int insertSelective(HelpKeyword record);

    HelpKeyword selectByPrimaryKey(Integer helpKeywordId);

    int updateByPrimaryKeySelective(HelpKeyword record);

    int updateByPrimaryKey(HelpKeyword record);
}