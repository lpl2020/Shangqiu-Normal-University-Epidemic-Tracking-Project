package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SetupActors;

public interface SetupActorsMapper {
    int insert(SetupActors record);

    int insertSelective(SetupActors record);
}