package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxhealthCollection;

public interface YqFxhealthCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqFxhealthCollection record);

    int insertSelective(YqFxhealthCollection record);

    YqFxhealthCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxhealthCollection record);

    int updateByPrimaryKey(YqFxhealthCollection record);
}