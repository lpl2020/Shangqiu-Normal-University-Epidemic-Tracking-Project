package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Statistics;

public interface StatisticsMapper {
    int insert(Statistics record);

    int insertSelective(Statistics record);
}