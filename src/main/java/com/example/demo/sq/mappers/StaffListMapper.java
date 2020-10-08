package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.StaffList;

public interface StaffListMapper {
    int insert(StaffList record);

    int insertSelective(StaffList record);
}