package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;

import java.util.List;
import java.util.Map;

public interface YqCollageConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCollageConfigure record);

    int insertSelective(YqCollageConfigure record);

    List<Map<String,Object>> getXyryInfo();

    YqCollageConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCollageConfigure record);

    int updateByPrimaryKey(YqCollageConfigure record);
}