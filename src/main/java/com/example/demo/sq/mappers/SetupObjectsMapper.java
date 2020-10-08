package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SetupObjects;

public interface SetupObjectsMapper {
    int insert(SetupObjects record);

    int insertSelective(SetupObjects record);
}