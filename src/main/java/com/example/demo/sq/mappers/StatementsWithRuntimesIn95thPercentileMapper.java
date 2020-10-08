package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementsWithRuntimesIn95thPercentileWithBLOBs;

public interface StatementsWithRuntimesIn95thPercentileMapper {
    int insert(StatementsWithRuntimesIn95thPercentileWithBLOBs record);

    int insertSelective(StatementsWithRuntimesIn95thPercentileWithBLOBs record);
}