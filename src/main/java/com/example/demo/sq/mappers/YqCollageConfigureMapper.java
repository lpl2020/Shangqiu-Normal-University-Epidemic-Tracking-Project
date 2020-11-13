package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqCollageConfigure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import java.util.List;
import java.util.List;
import java.util.Map;

@Repository
public interface YqCollageConfigureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YqCollageConfigure record);

    int insertSelective(YqCollageConfigure record);

    List<Map<String,Object>> getSchoolListInfo();

    List<YqCollageConfigure> postGetschoollist();

    List<YqCollageConfigure> postGetcollagelist(String schools);

    List<YqCollageConfigure> postpersonallitylist(String schools, String collages);

    List<Map<String,Object>> getXyryInfo(String school);

    YqCollageConfigure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqCollageConfigure record);

    int updateByPrimaryKey(YqCollageConfigure record);
}