package com.ggj.springboot.configbean;

import com.ggj.springboot.bean.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

/**
 * author:gaoguangjin
 * Description: 该接口作用于实例化阶段，完成实例化，属性描述修改以及实例化后处理逻辑
 * InstantiationAwareBeanPostProcessor 接口本质是BeanPostProcessor的子接口，一般我们继承Spring为其提供的适配器类InstantiationAwareBeanPostProcessorAdapter来使用它，
 * Email:335424093@qq.com
 * Date 2016/2/19 10:35
 */
@Component
public class MyInstantiationAwareBeanPostProcessor extends
        InstantiationAwareBeanPostProcessorAdapter {
    public Object postProcessBeforeInstantiation(Class<?> beanClass,
                                                 String beanName) throws BeansException {
        if(beanClass.getClass().isAssignableFrom(Person.class))
            System.out.println("MyInstantiationAwareBeanPostProcessor postProcessBeforeInstantiation called" + "===beanName:" + beanName);
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName)
            throws BeansException {
        if(bean instanceof Person)
        System.out .println("MyInstantiationAwareBeanPostProcessor postProcessAfterInstantiation called"+"===beanName:"+beanName);
        return true;
    }

    public PropertyValues postProcessPropertyValues(PropertyValues pvs,
                                                    PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        if(bean instanceof Person)
        System.out.println("MyInstantiationAwareBeanPostProcessor postProcessPropertyValues called");
        return pvs;
    }


}
