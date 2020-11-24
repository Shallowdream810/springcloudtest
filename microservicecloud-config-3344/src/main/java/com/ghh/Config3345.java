package com.ghh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 23:58 2020/11/24
 * @Modified By:
 */
@SpringBootApplication
@EnableConfigServer
public class Config3345 {
    public static void main(String[] args) {
        SpringApplication.run(Config3345.class, args);
    }
}
