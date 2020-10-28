package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;

import java.util.List;
import java.util.Map;

public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);
    List<Map<String,Object>> getYqFxdatacollection();

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);
}