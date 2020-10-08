package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.TablesPriv;
import com.example.demo.sq.entity.TablesPrivKey;

public interface TablesPrivMapper {
    int deleteByPrimaryKey(TablesPrivKey key);

    int insert(TablesPriv record);

    int insertSelective(TablesPriv record);

    TablesPriv selectByPrimaryKey(TablesPrivKey key);

    int updateByPrimaryKeySelective(TablesPriv record);

    int updateByPrimaryKey(TablesPriv record);
}