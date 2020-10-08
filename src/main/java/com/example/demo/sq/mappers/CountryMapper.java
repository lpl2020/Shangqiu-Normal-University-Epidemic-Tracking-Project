package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Country;

public interface CountryMapper {
    int insert(Country record);

    int insertSelective(Country record);
}