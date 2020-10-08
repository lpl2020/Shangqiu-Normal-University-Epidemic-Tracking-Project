package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Func;

public interface FuncMapper {
    int deleteByPrimaryKey(String name);

    int insert(Func record);

    int insertSelective(Func record);

    Func selectByPrimaryKey(String name);

    int updateByPrimaryKeySelective(Func record);

    int updateByPrimaryKey(Func record);
}