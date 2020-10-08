package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Metrics;

public interface MetricsMapper {
    int insert(Metrics record);

    int insertSelective(Metrics record);
}