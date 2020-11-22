package com.ghh.controller;

import com.ghh.api.entity.Dept;
import com.ghh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:41 2020/11/18
 * @Modified By:
 */
@RestController
public class DeptController {

    @Autowired
    DeptService deptService;
    //暴露所有的微服务信息
    @Autowired
    private DiscoveryClient client;

    @RequestMapping("findAll")
    public List<Dept> test(){
//        System.out.println("123成功");
        return deptService.list();
//        return null;
    }

    @RequestMapping("findById/{id}")
    public Dept findById(@PathVariable("id")Long id){
        return deptService.get(id);
    }

    @GetMapping("testRibbon")
    public String testRibbon(String text){
        return "8002端口项目"+text;
    }

    @RequestMapping(value = "dept/discovery",method = RequestMethod.GET)
    public Object discovery(){
//        查看当前所有微服务
        List<String> list = client.getServices();
        System.out.println("***************"+ list);
//        查看MISCROSERVICECLOUD-DEPT这个微服务的一些信息
        List<ServiceInstance> instances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.client;
    }



}
