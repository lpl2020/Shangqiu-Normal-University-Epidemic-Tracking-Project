package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatementsWithSortingWithBLOBs;

public interface StatementsWithSortingMapper {
    int insert(StatementsWithSortingWithBLOBs record);

    int insertSelective(StatementsWithSortingWithBLOBs record);
}