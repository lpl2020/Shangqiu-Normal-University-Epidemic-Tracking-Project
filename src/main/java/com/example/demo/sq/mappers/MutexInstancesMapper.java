package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.MutexInstances;

public interface MutexInstancesMapper {
    int insert(MutexInstances record);

    int insertSelective(MutexInstances record);
}