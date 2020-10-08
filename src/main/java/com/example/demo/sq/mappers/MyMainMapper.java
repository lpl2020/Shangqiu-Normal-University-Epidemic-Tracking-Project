package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MyMain;

public interface MyMainMapper {
    int deleteByPrimaryKey(String mainId);

    int insert(MyMain record);

    int insertSelective(MyMain record);

    MyMain selectByPrimaryKey(String mainId);

    int updateByPrimaryKeySelective(MyMain record);

    int updateByPrimaryKeyWithBLOBs(MyMain record);

    int updateByPrimaryKey(MyMain record);
}