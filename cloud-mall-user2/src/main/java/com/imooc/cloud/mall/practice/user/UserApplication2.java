package com.imooc.cloud.mall.practice.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 描述：     启动类
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.imooc.cloud.mall.practice.user.model.dao")
@EnableRedisHttpSession
public class UserApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication2.class, args);
    }
}
