package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqUrlToken;

public interface YqUrlTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqUrlToken record);

    int insertSelective(YqUrlToken record);

    YqUrlToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqUrlToken record);

    int updateByPrimaryKey(YqUrlToken record);
}