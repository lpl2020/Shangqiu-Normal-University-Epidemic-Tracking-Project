package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}