package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import com.example.demo.sq.entity.YqFxhealthCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YqFxhealthCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void insert(YqFxhealthCollection record);

    void postYqjkinfo(YqFxdataCollection record);

    int insertSelective(YqFxhealthCollection record);

    Map<String,Object> getHealthCollection();

    List<YqFxhealthCollection> jkSubmit(String school, String no);

    YqFxhealthCollection selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(YqFxhealthCollection record);

    int updateByPrimaryKey(YqFxhealthCollection record);

}