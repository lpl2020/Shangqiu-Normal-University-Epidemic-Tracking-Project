package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.EpidemicStatistic;

public interface EpidemicStatisticMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EpidemicStatistic record);

    int insertSelective(EpidemicStatistic record);

    EpidemicStatistic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EpidemicStatistic record);

    int updateByPrimaryKey(EpidemicStatistic record);
}