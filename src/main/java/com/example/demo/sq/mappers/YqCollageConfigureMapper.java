package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface YqCollageConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCollageConfigure record);

    int insertSelective(YqCollageConfigure record);

    YqCollageConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCollageConfigure record);

    int updateByPrimaryKey(YqCollageConfigure record);
    List<Map<String, Object>> getSygrgitDataInfo();
}