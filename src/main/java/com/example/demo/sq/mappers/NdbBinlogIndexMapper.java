package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.NdbBinlogIndex;
import com.example.demo.sq.entity.NdbBinlogIndexKey;

public interface NdbBinlogIndexMapper {
    int deleteByPrimaryKey(NdbBinlogIndexKey key);

    int insert(NdbBinlogIndex record);

    int insertSelective(NdbBinlogIndex record);

    NdbBinlogIndex selectByPrimaryKey(NdbBinlogIndexKey key);

    int updateByPrimaryKeySelective(NdbBinlogIndex record);

    int updateByPrimaryKey(NdbBinlogIndex record);
}