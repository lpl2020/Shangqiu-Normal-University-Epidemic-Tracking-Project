package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.HelpTopic;
import com.example.demo.sq.entity.HelpTopicWithBLOBs;

public interface HelpTopicMapper {
    int deleteByPrimaryKey(Integer helpTopicId);

    int insert(HelpTopicWithBLOBs record);

    int insertSelective(HelpTopicWithBLOBs record);

    HelpTopicWithBLOBs selectByPrimaryKey(Integer helpTopicId);

    int updateByPrimaryKeySelective(HelpTopicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HelpTopicWithBLOBs record);

    int updateByPrimaryKey(HelpTopic record);
}