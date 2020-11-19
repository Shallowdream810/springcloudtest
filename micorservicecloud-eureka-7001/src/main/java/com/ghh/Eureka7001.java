package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 22:11 2020/11/19
 * @Modified By:
 */
@SpringBootApplication
@ServletComponentScan
@EnableEurekaServer
public class Eureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }
}
