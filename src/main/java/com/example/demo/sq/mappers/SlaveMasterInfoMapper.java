package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SlaveMasterInfo;
import com.example.demo.sq.entity.SlaveMasterInfoWithBLOBs;

public interface SlaveMasterInfoMapper {
    int deleteByPrimaryKey(String channelName);

    int insert(SlaveMasterInfoWithBLOBs record);

    int insertSelective(SlaveMasterInfoWithBLOBs record);

    SlaveMasterInfoWithBLOBs selectByPrimaryKey(String channelName);

    int updateByPrimaryKeySelective(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveMasterInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveMasterInfo record);
}