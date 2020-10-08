package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCityGps;

public interface YqCityGpsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCityGps record);

    int insertSelective(YqCityGps record);

    YqCityGps selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCityGps record);

    int updateByPrimaryKey(YqCityGps record);
}