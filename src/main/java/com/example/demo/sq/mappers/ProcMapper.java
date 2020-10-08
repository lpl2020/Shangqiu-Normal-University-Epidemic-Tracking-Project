package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Proc;
import com.example.demo.sq.entity.ProcKey;
import com.example.demo.sq.entity.ProcWithBLOBs;

public interface ProcMapper {
    int deleteByPrimaryKey(ProcKey key);

    int insert(ProcWithBLOBs record);

    int insertSelective(ProcWithBLOBs record);

    ProcWithBLOBs selectByPrimaryKey(ProcKey key);

    int updateByPrimaryKeySelective(ProcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProcWithBLOBs record);

    int updateByPrimaryKey(Proc record);
}