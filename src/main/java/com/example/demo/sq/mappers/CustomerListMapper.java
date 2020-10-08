package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.CustomerList;

public interface CustomerListMapper {
    int insert(CustomerList record);

    int insertSelective(CustomerList record);
}