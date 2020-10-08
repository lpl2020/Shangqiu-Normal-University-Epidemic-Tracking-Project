package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Engines;

public interface EnginesMapper {
    int insert(Engines record);

    int insertSelective(Engines record);
}