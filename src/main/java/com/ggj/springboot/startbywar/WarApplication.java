package com.ggj.springboot.startbywar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * author:gaoguangjin
 * Description:springboot war方式启动,
 * spring boot推荐的方式是将main 方法所在的类放在应用包结构的根目录，这样@ComponentScan不用配置任何包路径，便能正常扫描到所有注解
 * 不然只会扫描main方法所在的目录以及子目录
 * Email:335424093@qq.com
 * Date 2015/12/23 13:32
 */
@SpringBootApplication
public class WarApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(WarApplication.class, args);
    }
    /**
     * Boot提供了可选的WebApplicationInitializer，它会使用servlet容器来注册应用
     * @param builder
     * @return
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return  builder.sources(WarApplication.class);
    }


}
