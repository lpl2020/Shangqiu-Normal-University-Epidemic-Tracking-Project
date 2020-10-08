package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatusByAccount;

public interface StatusByAccountMapper {
    int insert(StatusByAccount record);

    int insertSelective(StatusByAccount record);
}