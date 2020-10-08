package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.InnodbMetrics;

public interface InnodbMetricsMapper {
    int insert(InnodbMetrics record);

    int insertSelective(InnodbMetrics record);
}