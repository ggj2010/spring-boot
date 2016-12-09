package com.ggj.springboot.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * http://jinnianshilongnian.iteye.com/blog/1902886
 * @author:gaoguangjin
 * @date 2016/9/1 10:23
 */
@Component
public class EventAware implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public void  sendContent(ContentEvent contentEvent){
        //AbstractApplicationContext
        applicationContext.publishEvent(contentEvent);
    }

}
