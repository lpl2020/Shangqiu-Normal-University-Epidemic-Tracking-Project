package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Profiling;

public interface ProfilingMapper {
    int insert(Profiling record);

    int insertSelective(Profiling record);
}