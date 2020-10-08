package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Views;

public interface ViewsMapper {
    int insert(Views record);

    int insertSelective(Views record);
}