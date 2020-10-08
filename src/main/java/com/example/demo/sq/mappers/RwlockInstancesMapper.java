package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.RwlockInstances;

public interface RwlockInstancesMapper {
    int insert(RwlockInstances record);

    int insertSelective(RwlockInstances record);
}