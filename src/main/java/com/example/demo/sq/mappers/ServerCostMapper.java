package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ServerCost;

public interface ServerCostMapper {
    int deleteByPrimaryKey(String costName);

    int insert(ServerCost record);

    int insertSelective(ServerCost record);

    ServerCost selectByPrimaryKey(String costName);

    int updateByPrimaryKeySelective(ServerCost record);

    int updateByPrimaryKey(ServerCost record);
}