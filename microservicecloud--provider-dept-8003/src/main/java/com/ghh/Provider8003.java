package com.ghh;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:35 2020/11/18
 * @Modified By:
 */
@SpringBootApplication
@ServletComponentScan
@EnableAsync
@Slf4j
@EnableEurekaClient
@EnableDiscoveryClient //服务发现，暴漏出去
@MapperScan("com.ghh.dao")
public class Provider8003 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8003.class, args);
    }
}
