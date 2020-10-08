package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.Rental;

public interface RentalMapper {
    int deleteByPrimaryKey(Integer rentalId);

    int insert(Rental record);

    int insertSelective(Rental record);

    Rental selectByPrimaryKey(Integer rentalId);

    int updateByPrimaryKeySelective(Rental record);

    int updateByPrimaryKey(Rental record);
}