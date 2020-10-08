package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SlaveRelayLogInfo;
import com.example.demo.sq.entity.SlaveRelayLogInfoWithBLOBs;

public interface SlaveRelayLogInfoMapper {
    int deleteByPrimaryKey(String channelName);

    int insert(SlaveRelayLogInfoWithBLOBs record);

    int insertSelective(SlaveRelayLogInfoWithBLOBs record);

    SlaveRelayLogInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByPrimaryKeySelective(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveRelayLogInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveRelayLogInfo record);
}