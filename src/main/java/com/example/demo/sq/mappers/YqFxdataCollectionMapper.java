package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);

    List<Map<String,Object>> getFxdataInfo();

    List<Map<String,Object>> getYqIbodyInfo();

    List<Map<String,Object>> getRmlyInfo();

    List<Map<String,String>> getYqFxTrafficInfo();

    List<Map<String,Object>> getYqFxrylyInfo();

    List<Map<String,Object>> getYqEveryYuanFxdataInfo();

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);

}