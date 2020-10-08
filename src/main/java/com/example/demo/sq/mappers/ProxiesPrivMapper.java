package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.ProxiesPriv;
import com.example.demo.sq.entity.ProxiesPrivKey;

public interface ProxiesPrivMapper {
    int deleteByPrimaryKey(ProxiesPrivKey key);

    int insert(ProxiesPriv record);

    int insertSelective(ProxiesPriv record);

    ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

    int updateByPrimaryKeySelective(ProxiesPriv record);

    int updateByPrimaryKey(ProxiesPriv record);
}