package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.PreparedStatementsInstances;

public interface PreparedStatementsInstancesMapper {
    int insert(PreparedStatementsInstances record);

    int insertSelective(PreparedStatementsInstances record);
}