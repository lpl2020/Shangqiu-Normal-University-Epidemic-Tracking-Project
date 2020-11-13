package com.example.demo.sq.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sq.entity.YqSchoolConfigure;
import com.example.demo.sq.mappers.YqSchoolConfigureMapper;
import com.example.demo.sq.service.YqjkdataService;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class YqjkdataServiceImpl implements YqjkdataService {
    @Autowired
    YqSchoolConfigureMapper yqSchoolConfigureMapper;

    public JSONObject getYqjkdataInfo(String school) {

        JSONObject resultJsonObject = new JSONObject();
        List<Map<String, String>> schoolInfo = yqSchoolConfigureMapper.getSchoolInfo(school);
        Map<String, String> r = schoolInfo.get(0);
        Iterator iterator = r.keySet().iterator();
//        获取省份和城市
        String province = r.get(iterator.next());
        String city = r.get(iterator.next());
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("authoration", "apicode");
        headers.add("apicode", "65f2157f4fff4426b83519770ec5bd9b");

//		//解决转发问题
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        HttpClient httpClient = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build();

        factory.setHttpClient(httpClient);
        restTemplate.setRequestFactory(factory);
        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity(null, headers);
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromHttpUrl("http://api.yonyoucloud.com/apis/dst/ncov/country");
        String resEntity = restTemplate.exchange(builder.build().toString(), HttpMethod.GET, request, String.class)
                .getBody();

        UriComponentsBuilder builder2 = UriComponentsBuilder
                .fromHttpUrl("https://api.yonyoucloud.com/apis/dst/ncov/spreadQuery");
        String resEntity2 = restTemplate.exchange(builder2.build().toString(), HttpMethod.GET, request, String.class)
                .getBody();

        JSONObject jsonResult = JSONObject.parseObject(resEntity);
        JSONObject jsonResult2 = JSONObject.parseObject(resEntity2);

        JSONObject dataResult = JSONObject.parseObject(jsonResult.get("data").toString());

        Integer[] qx = {0, 0, 0, 0, 0, 0};
        Integer[] qshi = {0, 0, 0, 0, 0, 0};
        Integer[] qshen = {0, 0, 0, 0, 0, 0};
        Integer[] qg = {0, 0, 0, 0, 0, 0};
        JSONArray mapResultList = JSONArray.parseArray(jsonResult2.get("newslist").toString());
        for (int i = 0; i < mapResultList.size(); i++) {
            String provinceName = JSONObject.parseObject(mapResultList.get(i).toString()).get("provinceName")
                    .toString();
            if (provinceName.contains(province)) {
                JSONObject sfInfo = JSONObject.parseObject(mapResultList.get(i).toString());
                qshen[0] = sfInfo.getInteger("confirmedCount");
//				qshen[1] = sfInfo.getInteger("");
                qshen[2] = sfInfo.getInteger("currentConfirmedCount");
                qshen[3] = sfInfo.getInteger("suspectedCount");
                qshen[4] = sfInfo.getInteger("curedCount");
                qshen[5] = sfInfo.getInteger("deadCount");
                JSONArray cityResultList = JSONArray.parseArray(sfInfo.get("cities").toString());
                for (int j = 0; j < cityResultList.size(); j++) {
                    JSONObject cityInfo = cityResultList.getJSONObject(j);
                    if (city.equals(cityInfo.getString("cityName"))) {
                        qshi[0] = cityInfo.getInteger("confirmedCount");
//						qshi[1] = cityInfo.getInteger("");
                        qshi[2] = cityInfo.getInteger("currentConfirmedCount");
                        qshi[3] = cityInfo.getInteger("suspectedCount");
                        qshi[4] = cityInfo.getInteger("curedCount");
                        qshi[5] = cityInfo.getInteger("deadCount");
                    }
                }
//				logger.info("----------------"+mapResultList.get(i).toString());
            }
        }
        qg[0] = dataResult.getInteger("confirmedCount");
//		qg[1] = dataResult.getInteger("");
        qg[2] = dataResult.getInteger("currentConfirmedCount");
        qg[3] = dataResult.getInteger("suspectedCount");
        qg[4] = dataResult.getInteger("curedCount");
        qg[5] = dataResult.getInteger("deadCount");

        resultJsonObject.put("errorCode", "");// 错误码4000参数为空 4001参数不正确， 4002认证失败
        JSONObject result = new JSONObject();
        result.put("qg", qg);
        result.put("qx", qx);
        result.put("qshen", qshen);
        result.put("qshi", qshi);
        resultJsonObject.put("result", result);// 错误码4000参数为空 4001参数不正确， 4002认证失败
        return resultJsonObject;
    }
}
