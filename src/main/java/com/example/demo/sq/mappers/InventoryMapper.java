package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Inventory;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer inventoryId);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer inventoryId);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}