package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MyInfo;

public interface MyInfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(MyInfo record);

    int insertSelective(MyInfo record);

    MyInfo selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(MyInfo record);

    int updateByPrimaryKey(MyInfo record);
}