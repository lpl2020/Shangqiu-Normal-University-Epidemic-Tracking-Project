package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CdcTimeLog;

public interface CdcTimeLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CdcTimeLog record);

    int insertSelective(CdcTimeLog record);

    CdcTimeLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CdcTimeLog record);

    int updateByPrimaryKey(CdcTimeLog record);
}