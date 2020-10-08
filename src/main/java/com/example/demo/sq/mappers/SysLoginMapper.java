package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SysLogin;

public interface SysLoginMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(SysLogin record);

    int insertSelective(SysLogin record);

    SysLogin selectByPrimaryKey(Integer loginId);

    int updateByPrimaryKeySelective(SysLogin record);

    int updateByPrimaryKey(SysLogin record);
}