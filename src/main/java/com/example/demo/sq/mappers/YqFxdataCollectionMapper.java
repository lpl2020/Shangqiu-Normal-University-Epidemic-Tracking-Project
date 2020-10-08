package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;

public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);
}