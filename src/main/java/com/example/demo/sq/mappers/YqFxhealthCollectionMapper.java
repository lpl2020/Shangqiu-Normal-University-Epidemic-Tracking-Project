package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqFxhealthCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(YqFxhealthCollection record);

    void postYqjkinfo(YqFxdataCollection record);

    int insertSelective(YqFxhealthCollection record);

    List<Map<String,Object>> getEntiCountDataInfo(String studentno);

    List<Map<String,Object>> getPersionDataInfo(String school,String userNo);

    List<Map<String,Object>> getSysjDataInfo(String school);

    List<Map<String,Object>> getYjxnDataInfo(String school);
    List<Map<String,Object>> getYjxnsDataInfo(String school);

    YqFxhealthCollection selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(YqFxhealthCollection record);

    int updateByPrimaryKey(YqFxhealthCollection record);

}