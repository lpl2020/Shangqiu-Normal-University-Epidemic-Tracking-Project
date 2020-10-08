package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SalesByFilmCategory;

public interface SalesByFilmCategoryMapper {
    int insert(SalesByFilmCategory record);

    int insertSelective(SalesByFilmCategory record);
}