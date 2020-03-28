package com.ywy.mall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * Created by ywy on 2020/3/27
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ywy.mall.ums.mapper")
public class MallUmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallUmsApplication.class,args);
    }
}
