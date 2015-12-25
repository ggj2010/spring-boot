package com.ggj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * author:gaoguangjin
 * Description:将applicatfon放到根目录,需要tomcat启动.
 * Email:335424093@qq.com
 * Date 2015/12/25 11:46
 */
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }
    /**
     * Boot提供了可选的WebApplicationInitializer，它会使用servlet容器来注册应用
     * @param builder
     * @return
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MainApplication.class);
    }
}
