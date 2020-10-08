package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Collations;

public interface CollationsMapper {
    int insert(Collations record);

    int insertSelective(Collations record);
}