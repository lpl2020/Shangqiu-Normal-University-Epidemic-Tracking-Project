package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ForumMain;

public interface ForumMainMapper {
    int deleteByPrimaryKey(String mainId);

    int insert(ForumMain record);

    int insertSelective(ForumMain record);

    ForumMain selectByPrimaryKey(String mainId);

    int updateByPrimaryKeySelective(ForumMain record);

    int updateByPrimaryKeyWithBLOBs(ForumMain record);

    int updateByPrimaryKey(ForumMain record);
}