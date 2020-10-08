package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MySecond;

public interface MySecondMapper {
    int deleteByPrimaryKey(String secId);

    int insert(MySecond record);

    int insertSelective(MySecond record);

    MySecond selectByPrimaryKey(String secId);

    int updateByPrimaryKeySelective(MySecond record);

    int updateByPrimaryKeyWithBLOBs(MySecond record);

    int updateByPrimaryKey(MySecond record);
}