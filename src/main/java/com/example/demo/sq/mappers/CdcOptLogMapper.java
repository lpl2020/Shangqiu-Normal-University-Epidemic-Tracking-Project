package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CdcOptLog;

public interface CdcOptLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CdcOptLog record);

    int insertSelective(CdcOptLog record);

    CdcOptLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CdcOptLog record);

    int updateByPrimaryKey(CdcOptLog record);
}