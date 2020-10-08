package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ObjectsSummaryGlobalByType;

public interface ObjectsSummaryGlobalByTypeMapper {
    int insert(ObjectsSummaryGlobalByType record);

    int insertSelective(ObjectsSummaryGlobalByType record);
}