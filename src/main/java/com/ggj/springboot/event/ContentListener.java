package com.ggj.springboot.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ContentEvent 监听器
 * @author:gaoguangjin
 * @date 2016/9/1 10:00
 */
@Component
@Slf4j
public class ContentListener implements ApplicationListener<ContentEvent> {
    @Override
    public void onApplicationEvent(ContentEvent contentEvent) {
        log.info("ContentListener 被执行："+contentEvent.getSource().toString());
    }
}
