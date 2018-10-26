
package com.ggj.springboot.configbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ConfigurableWebApplicationContext;

/**
 * @author:gaoguangjin
 * @date:2018/10/26
 */
@Component
public class SpringHolder implements ApplicationContextAware, InitializingBean {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringHolder.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ConfigurableWebApplicationContext cwac = (ConfigurableWebApplicationContext) applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) cwac.getBeanFactory();
        // 自己注册bean
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder
                .genericBeanDefinition(CustomBean.class.getName());
        //设置依赖bean 这个bean前提是已经被spring代理了
        beanDefinitionBuilder.addPropertyReference("refrenceBean","refrenceBean");
        beanFactory.registerBeanDefinition("customBean", beanDefinitionBuilder.getBeanDefinition());
        // 去除bean
        // beanFactory.removeBeanDefinition("customBean");
    }

}
