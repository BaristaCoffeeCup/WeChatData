package com.wanghy.wechatdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WeChatDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeChatDataApplication.class, args);
    }

}
