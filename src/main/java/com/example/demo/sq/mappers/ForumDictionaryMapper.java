package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumDictionary;

public interface ForumDictionaryMapper {
    int deleteByPrimaryKey(Integer dictId);

    int insert(ForumDictionary record);

    int insertSelective(ForumDictionary record);

    ForumDictionary selectByPrimaryKey(Integer dictId);

    int updateByPrimaryKeySelective(ForumDictionary record);

    int updateByPrimaryKey(ForumDictionary record);
}