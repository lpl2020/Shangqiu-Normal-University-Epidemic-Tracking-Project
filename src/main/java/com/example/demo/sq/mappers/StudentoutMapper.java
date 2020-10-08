package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Studentout;

public interface StudentoutMapper {
    int insert(Studentout record);

    int insertSelective(Studentout record);
}