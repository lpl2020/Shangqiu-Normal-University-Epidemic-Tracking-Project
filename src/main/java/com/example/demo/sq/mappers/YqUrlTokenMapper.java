package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqUrlToken;

import java.util.List;
import java.util.Map;

public interface YqUrlTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqUrlToken record);

    int insertSelective(YqUrlToken record);
    List<Map<String,Object>> getUrlToken();

    YqUrlToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqUrlToken record);

    int updateByPrimaryKey(YqUrlToken record);
}