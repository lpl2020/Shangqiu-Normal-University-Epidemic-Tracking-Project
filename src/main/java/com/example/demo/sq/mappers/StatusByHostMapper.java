package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatusByHost;

public interface StatusByHostMapper {
    int insert(StatusByHost record);

    int insertSelective(StatusByHost record);
}