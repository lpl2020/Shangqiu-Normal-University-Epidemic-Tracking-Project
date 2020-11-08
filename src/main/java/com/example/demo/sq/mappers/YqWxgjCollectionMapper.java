package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqWxgjCollection;

import java.util.List;
import java.util.Map;

public interface YqWxgjCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqWxgjCollection record);

    int insertSelective(YqWxgjCollection record);

    List<Map<String,Object>> getXyRyInfo(String school);

    List<Map<String,Object>> getXyYjInfo(String school);

    YqWxgjCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqWxgjCollection record);

    int updateByPrimaryKey(YqWxgjCollection record);
}