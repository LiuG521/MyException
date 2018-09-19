package com.cssl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: ideaWorkSpance2
 * @Date: 2018/8/12 11:57
 * @Author: 刘帅哥
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.cssl.com.cssl.action.dao")
@EnableTransactionManagement
public class SpringApp {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringApp.class);
        application.run(args);
    }
}
