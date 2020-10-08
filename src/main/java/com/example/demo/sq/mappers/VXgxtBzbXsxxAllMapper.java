package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.VXgxtBzbXsxxAll;

public interface VXgxtBzbXsxxAllMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VXgxtBzbXsxxAll record);

    int insertSelective(VXgxtBzbXsxxAll record);

    VXgxtBzbXsxxAll selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VXgxtBzbXsxxAll record);

    int updateByPrimaryKey(VXgxtBzbXsxxAll record);
}