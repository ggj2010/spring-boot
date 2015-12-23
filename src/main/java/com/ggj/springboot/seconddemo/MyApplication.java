package com.ggj.springboot.seconddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

/**
 * author:gaoguangjin
 * Description:自定义端口号,http://localhost/rest
 * Email:335424093@qq.com
 * Date 2015/12/23 10:09
 */
@SpringBootApplication
public class MyApplication extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer{

    @Override
    /**
     * 实现EmbeddedServletContainerCustomizer类，自定义端口号，项目发布名称(只有tomcat启动才有效)等
     */
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(80);
    }

    public static void main(String[] args) {
         ApplicationContext applicationContext = SpringApplication.run(MyApplication.class, args);
    }

    /**
     * 重写configure方法
     * @param builder
     * @return
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyApplication.class);
    }
}
