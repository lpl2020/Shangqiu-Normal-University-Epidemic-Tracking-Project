package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.GlobalStatus;

public interface GlobalStatusMapper {
    int insert(GlobalStatus record);

    int insertSelective(GlobalStatus record);
}