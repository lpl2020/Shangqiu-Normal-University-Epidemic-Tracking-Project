package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SetupConsumers;

public interface SetupConsumersMapper {
    int insert(SetupConsumers record);

    int insertSelective(SetupConsumers record);
}