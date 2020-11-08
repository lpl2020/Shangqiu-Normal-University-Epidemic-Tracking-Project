package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.service.YqglCountService;
import org.springframework.stereotype.Service;

@Service
public class YqglCountServiceImpl implements YqglCountService {
    @Override
    public JSONObject getGlCountInfo(String isStudent,String personNo){


        JSONObject resultJsonObject = new JSONObject();

        try {
            //List<EpideSituDisplayPerModel> baseInfoList=EpideSituDisplayPersionMapper.getEntiCount();
//			if(baseInfoList.size()<=0) {
//				resultJsonObject.put("errorCode", "4000");//错误码4000参数为空 4001参数不正确， 4002认证失败
//				return resultJsonObject;
//			}
            resultJsonObject.put("errorCode", "");//错误码4000参数为空 4001参数不正确， 4002认证失败
            resultJsonObject.put("isStudent", isStudent);//输入值
            resultJsonObject.put("personNo", personNo);//输入值
            JSONArray objectArray = new JSONArray();//Json数组

            JSONObject object1 = new JSONObject();
            object1.put("value",0);
            object1.put("name","正在14天隔离人数");
            objectArray.add(object1);
            JSONObject object2 = new JSONObject();
            object2.put("value",0);
            object2.put("name","结束14天隔离人数");
            objectArray.add(object2);
            resultJsonObject.put("data", objectArray);//输入值

//			resultJsonObject.put("teachercount", baseInfoList.get(0).getTeachercount());//教师数量
//			resultJsonObject.put("studentcount", baseInfoList.get(0).getStudentcount());//学生数量
//			resultJsonObject.put("foreigner", baseInfoList.get(0).getForeigner());//留学生
//			resultJsonObject.put("other", baseInfoList.get(0).getOther());//随访人
//			resultJsonObject.put("fromOtherCountry", baseInfoList.get(0).getFromOtherCountry());//境外输入
//			resultJsonObject.put("fromWuHan", baseInfoList.get(0).getFromWuHan());//武汉输入
//			resultJsonObject.put("focusObservation", baseInfoList.get(0).getFocusObservation());//重点观察
        } catch (Exception e) {
            resultJsonObject.put("errorCode", "4003");//错误码4000参数为空 4001参数不正确， 4002认证失败
            // TODO: handle exception
        }

        return resultJsonObject;
    }
}
