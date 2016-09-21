package com.ggj.springboot.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 有序监听器
 * @author:gaoguangjin
 * @date 2016/9/1 10:03
 */
@Component
@Slf4j
public class OrderFristListener implements SmartApplicationListener {
    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == ContentEvent.class;
    }

    @Override
    public boolean supportsSourceType(Class<?> aClass) {
        return aClass == String.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
         log.info("有序00000：被执行："+applicationEvent.getSource().toString());
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
