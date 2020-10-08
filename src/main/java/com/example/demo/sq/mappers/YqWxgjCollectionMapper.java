package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqWxgjCollection;

public interface YqWxgjCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqWxgjCollection record);

    int insertSelective(YqWxgjCollection record);

    YqWxgjCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqWxgjCollection record);

    int updateByPrimaryKey(YqWxgjCollection record);
}