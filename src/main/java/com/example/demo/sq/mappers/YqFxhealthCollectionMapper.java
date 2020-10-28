package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxhealthCollection;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface YqFxhealthCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqFxhealthCollection record);

    int insertSelective(YqFxhealthCollection record);

    List<Map<String,Object>> getYqFxhealthInfo();

    List<Map<String,Object>> getFxdataInfo();

    YqFxhealthCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxhealthCollection record);

    int updateByPrimaryKey(YqFxhealthCollection record);
}