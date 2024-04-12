package com.xing.springbootmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// 扫描 mapper 包下的所有接口
@MapperScan("com.xing.springbootmp.mapper")
@SpringBootApplication
public class SpringbootMpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMpApplication.class, args);
        System.out.println("\nRun!");
    }

}
