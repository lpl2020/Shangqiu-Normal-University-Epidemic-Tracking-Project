package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}