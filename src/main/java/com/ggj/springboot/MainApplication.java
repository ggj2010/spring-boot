package com.ggj.springboot;

import com.ggj.springboot.runners.TestConfigBeanRunner;
import com.ggj.springboot.runners.TestConfigValueRunner;
import com.ggj.springboot.runners.TestConfigYMLRunner;
import com.ggj.springboot.runners.TestH2Runner;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

/**
 * author:gaoguangjin
 * Description:
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
     *  Tomcat 默认的 HTTP 实现是采用阻塞式的 Socket 通信，每个请求都需要创建一个线程处理。这种模式下的并发量受到线程数的限制，但对于 Tomcat 来说几乎没有 BUG 存在了。
     *  Tomcat 还可以配置 NIO 方式的 Socket 通信，在性能上高于阻塞式的，每个请求也不需要创建一个线程进行处理，并发能力比前者高。但没有阻塞式的成熟。
     * */

    @Bean
    public EmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() throws IOException {
        TomcatEmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory = new TomcatEmbeddedServletContainerFactory();
        tomcatEmbeddedServletContainerFactory.addConnectorCustomizers(getTomcatConnectorCustomizer());
       // tomcatEmbeddedServletContainerFactory.addAdditionalTomcatConnectors(getConnector());
        return tomcatEmbeddedServletContainerFactory;
    }

    public TomcatConnectorCustomizer getTomcatConnectorCustomizer() throws IOException {
        return new TomcatConnectorCustomizer(){
            @Override
            public void customize(Connector connector) {
                Http11NioProtocol http11NioProtocol = (Http11NioProtocol) connector.getProtocolHandler();
                http11NioProtocol.setPort(81);
                //设置最大线程数
                http11NioProtocol.setMaxThreads(900);
                //设置初始线程数  最小空闲线程数
                http11NioProtocol.setMinSpareThreads(20);
                //最大连接数 最大连接数要大于最大线程数
                http11NioProtocol.setMaxConnections(1000);
                //设置超时
                http11NioProtocol.setConnectionTimeout(5000);
            }
        };

    }

    /**
     * https default connector, e.g. for SSL or AJP https 形式使用自定义的Http11NioProtocol
     * @return
     */
    public Connector getConnector() {
          Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        Http11NioProtocol http11NioProtocol = (Http11NioProtocol) connector.getProtocolHandler();
        http11NioProtocol.setPort(80);
        //设置最大线程数
        http11NioProtocol.setMaxThreads(100);
        //设置初始线程数  最小空闲线程数
        http11NioProtocol.setMinSpareThreads(20);
        http11NioProtocol.setMaxConnections(1000);
        //设置超时
        http11NioProtocol.setConnectionTimeout(5000);
        return connector;
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
