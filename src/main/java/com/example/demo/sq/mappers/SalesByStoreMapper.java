package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.SalesByStore;

public interface SalesByStoreMapper {
    int insert(SalesByStore record);

    int insertSelective(SalesByStore record);
}