package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;

public interface YqCollageConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCollageConfigure record);

    int insertSelective(YqCollageConfigure record);

    YqCollageConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCollageConfigure record);

    int updateByPrimaryKey(YqCollageConfigure record);
}