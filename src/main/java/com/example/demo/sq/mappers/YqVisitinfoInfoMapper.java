package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqVisitinfoInfo;

public interface YqVisitinfoInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqVisitinfoInfo record);

    int insertSelective(YqVisitinfoInfo record);

    YqVisitinfoInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqVisitinfoInfo record);

    int updateByPrimaryKey(YqVisitinfoInfo record);
}