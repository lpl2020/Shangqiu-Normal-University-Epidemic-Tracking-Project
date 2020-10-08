package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Db;
import com.example.demo.sq.entity.DbKey;

public interface DbMapper {
    int deleteByPrimaryKey(DbKey key);

    int insert(Db record);

    int insertSelective(Db record);

    Db selectByPrimaryKey(DbKey key);

    int updateByPrimaryKeySelective(Db record);

    int updateByPrimaryKey(Db record);
}