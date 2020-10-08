package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ProcsPriv;
import com.example.demo.sq.entity.ProcsPrivKey;

public interface ProcsPrivMapper {
    int deleteByPrimaryKey(ProcsPrivKey key);

    int insert(ProcsPriv record);

    int insertSelective(ProcsPriv record);

    ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

    int updateByPrimaryKeySelective(ProcsPriv record);

    int updateByPrimaryKey(ProcsPriv record);
}