package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SocketInstances;

public interface SocketInstancesMapper {
    int insert(SocketInstances record);

    int insertSelective(SocketInstances record);
}