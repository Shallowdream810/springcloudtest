package com.ghh.controller;

import com.ghh.api.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:41 2020/11/18
 * @Modified By:
 */
@RestController
public class DeptController {

    @Value("${REST_URL}")
    private  String REST_URL;

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping("findAll")
    public List<Dept> test(){
        List<Dept> dept = restTemplate.getForObject(REST_URL + "findAll", List.class);
        return dept;
    }
    @RequestMapping("consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL+"dept/discovery",Object.class);
    }
}
