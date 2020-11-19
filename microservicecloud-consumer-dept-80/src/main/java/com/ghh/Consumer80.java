package com.ghh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author: GuanHaoHao
 * @Description:
 * @Date: Create in 20:35 2020/11/18
 * @Modified By:
 */
@SpringBootApplication
@ServletComponentScan
@Slf4j
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
