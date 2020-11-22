package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:35 2020/11/18
 * @Modified By:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ghh.api.service"})
//@ComponentScan("com.ghh")
//自定义配值自己所
public class Feign {
    public static void main(String[] args) {
        SpringApplication.run(Feign.class, args);
    }
}
