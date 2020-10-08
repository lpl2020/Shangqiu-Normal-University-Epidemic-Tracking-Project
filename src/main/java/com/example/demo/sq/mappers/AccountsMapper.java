package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Accounts;

public interface AccountsMapper {
    int insert(Accounts record);

    int insertSelective(Accounts record);
}