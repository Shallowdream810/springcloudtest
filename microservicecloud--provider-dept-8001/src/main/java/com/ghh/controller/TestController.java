package com.ghh.controller;

import com.ghh.api.entity.Dept;
import com.ghh.service.DeptService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 22:59 2020/11/24
 * @Modified By:
 */
@RestController
@RequestMapping("test")
public class TestController {


    @Autowired
    DeptService deptService;

    @RequestMapping("findAll")
    public Dept findById(){
        return deptService.getOne(3L);
    }
}
