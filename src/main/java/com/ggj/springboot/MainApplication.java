package com.ggj.springboot;

import com.ggj.springboot.runners.TestConfigBeanRunner;
import com.ggj.springboot.runners.TestConfigValueRunner;
import com.ggj.springboot.runners.TestConfigYMLRunner;
import com.ggj.springboot.runners.TestH2Runner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * author:gaoguangjin
 * Description:将applicatfon放到根目录,需要tomcat启动.
 * Email:335424093@qq.com
 * Date 2015/12/25 11:46
 */

//@ComponentScan(com.ggj)

@EnableConfigurationProperties
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class);
    }

    /**
     * 测试用的 调用时候打开构造器
     * @return
     */
   /* @Bean
    public TestConfigBeanRunner testConfigBeanRunner() {
        return new TestConfigBeanRunner();
    }*/

 /*   @Bean
    public TestConfigValueRunner testConfigValueRunner() {
        return new TestConfigValueRunner();
    }*/

    //测试profile
 /*   @Bean
    public TestConfigYMLRunner testConfigYMLRunner() {
        return new TestConfigYMLRunner();
    }*/

    //测试H2数据库
  /*  @Bean
    public TestH2Runner testH2Runner() {
        return new TestH2Runner();
    }*/

}
