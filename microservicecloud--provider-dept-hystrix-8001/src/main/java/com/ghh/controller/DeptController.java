package com.ghh.controller;

import com.ghh.api.entity.Dept;
import com.ghh.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
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
    //当前方法嗲勇敢抛出错误信息后，会自动调用标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_GET")
    //弊端在于如果这样处理的话，每添加一个方法可能就需要多写一个指定方法，出现冗余，改成放在api中进行处理
    public Dept findById(@PathVariable("id")Long id){
        Dept dept = deptService.get(id);
        if (dept==null){
            throw new RuntimeException("该id："+id+"不存在此数据");
        }
        return dept;
    }
    public Dept processHystrix_GET(@PathVariable("id")Long id){
        Dept dept = new Dept();
        dept.setDeptno(id);
        dept.setDbSource("no this database has this source");
        dept.setDname("该id："+id+"不存在此数据 ,null--@HystrixCommand");
        return dept;
    }


    @GetMapping("testRibbon")
    public String testRibbon(String text){
        return "8001端口项目"+text;
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
