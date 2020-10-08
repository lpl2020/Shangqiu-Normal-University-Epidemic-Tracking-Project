package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SlaveWorkerInfo;
import com.example.demo.sq.entity.SlaveWorkerInfoKey;
import com.example.demo.sq.entity.SlaveWorkerInfoWithBLOBs;

public interface SlaveWorkerInfoMapper {
    int deleteByPrimaryKey(SlaveWorkerInfoKey key);

    int insert(SlaveWorkerInfoWithBLOBs record);

    int insertSelective(SlaveWorkerInfoWithBLOBs record);

    SlaveWorkerInfoWithBLOBs selectByPrimaryKey(SlaveWorkerInfoKey key);

    int updateByPrimaryKeySelective(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SlaveWorkerInfoWithBLOBs record);

    int updateByPrimaryKey(SlaveWorkerInfo record);
}