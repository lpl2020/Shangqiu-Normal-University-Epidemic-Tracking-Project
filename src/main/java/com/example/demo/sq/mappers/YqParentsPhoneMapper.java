package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqParentsPhone;

public interface YqParentsPhoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqParentsPhone record);

    int insertSelective(YqParentsPhone record);

    YqParentsPhone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqParentsPhone record);

    int updateByPrimaryKey(YqParentsPhone record);
}