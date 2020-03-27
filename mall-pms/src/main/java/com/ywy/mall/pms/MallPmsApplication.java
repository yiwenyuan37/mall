package com.ywy.mall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by ywy on 2020/3/26
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ywy.mall.pms.mapper")
public class MallPmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallPmsApplication.class,args);
    }
}
