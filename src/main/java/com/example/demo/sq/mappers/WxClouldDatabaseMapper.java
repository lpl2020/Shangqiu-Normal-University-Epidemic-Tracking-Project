package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.WxClouldDatabase;

public interface WxClouldDatabaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxClouldDatabase record);

    int insertSelective(WxClouldDatabase record);

    WxClouldDatabase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxClouldDatabase record);

    int updateByPrimaryKey(WxClouldDatabase record);
}