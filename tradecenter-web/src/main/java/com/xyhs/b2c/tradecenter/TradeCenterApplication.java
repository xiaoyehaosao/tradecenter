package com.xyhs.b2c.tradecenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ljp
 * @apiNote
 * @date 15:07 2019/11/13
 **/
//@SpringBootApplication(scanBasePackages = {"com.xyhs.common.config"})
@MapperScan("com.xyhs.b2c.tradecenter.mapper")
@SpringCloudApplication
public class TradeCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TradeCenterApplication.class,args);
    }
}
