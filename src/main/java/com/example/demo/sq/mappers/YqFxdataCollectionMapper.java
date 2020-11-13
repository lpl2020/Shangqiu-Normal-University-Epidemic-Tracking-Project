package com.example.demo.sq.mappers;

import com.example.demo.sq.entity.YqFxdataCollection;
import com.example.demo.sq.entity.YqStudentInfo;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface YqFxdataCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    void postYqFxbdinfo(YqFxdataCollection record);

    int insertSelective(YqFxdataCollection record);

    Map<String,Object> getBaseInfo();

    List<YqFxdataCollection> jtSubmit(String school, String no);

    YqFxdataCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YqFxdataCollection record);

    int updateByPrimaryKey(YqFxdataCollection record);

}