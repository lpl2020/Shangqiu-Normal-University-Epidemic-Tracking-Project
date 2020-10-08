package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.GtidExecuted;
import com.example.demo.sq.entity.GtidExecutedKey;

public interface GtidExecutedMapper {
    int deleteByPrimaryKey(GtidExecutedKey key);

    int insert(GtidExecuted record);

    int insertSelective(GtidExecuted record);

    GtidExecuted selectByPrimaryKey(GtidExecutedKey key);

    int updateByPrimaryKeySelective(GtidExecuted record);

    int updateByPrimaryKey(GtidExecuted record);
}