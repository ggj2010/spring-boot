package com.ggj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * author:gaoguangjin
 * Description:将applicatfon放到根目录,需要tomcat启动.
 * Email:335424093@qq.com
 * Date 2015/12/25 11:46
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
}
