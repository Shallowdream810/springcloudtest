package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author: GuanHaoHao
 * @Description: 通过路由来直接访问各种微服务
 *          // 不使用路由  http://localhost:8001/findAll
 *          //  使用之后   http://myzuul.com:9527/microservicecloud-dept/findAll
 *          //  网关找到对应微服务名称，再对应的接口
 * @Date: Create in 22:38 2020/11/24
 * @Modified By:
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul9527 {
    public static void main(String[] args) {
        SpringApplication.run(Zuul9527.class, args);
    }
}
