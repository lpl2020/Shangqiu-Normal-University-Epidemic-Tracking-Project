package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CondInstances;

public interface CondInstancesMapper {
    int insert(CondInstances record);

    int insertSelective(CondInstances record);
}