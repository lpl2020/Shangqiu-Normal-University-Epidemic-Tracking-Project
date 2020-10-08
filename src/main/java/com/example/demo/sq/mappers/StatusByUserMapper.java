package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StatusByUser;

public interface StatusByUserMapper {
    int insert(StatusByUser record);

    int insertSelective(StatusByUser record);
}