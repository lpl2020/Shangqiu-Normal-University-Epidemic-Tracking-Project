package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ColumnsPriv;
import com.example.demo.sq.entity.ColumnsPrivKey;

public interface ColumnsPrivMapper {
    int deleteByPrimaryKey(ColumnsPrivKey key);

    int insert(ColumnsPriv record);

    int insertSelective(ColumnsPriv record);

    ColumnsPriv selectByPrimaryKey(ColumnsPrivKey key);

    int updateByPrimaryKeySelective(ColumnsPriv record);

    int updateByPrimaryKey(ColumnsPriv record);
}