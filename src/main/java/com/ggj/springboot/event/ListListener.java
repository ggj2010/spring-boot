package com.ggj.springboot.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**定义无序监听器
 * @author:gaoguangjin
 * @date 2016/9/1 10:01
 */
@Component
@Slf4j
public class ListListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
            if(applicationEvent instanceof  ContentEvent){
                log.info("ListListener 被执行："+applicationEvent.getSource().toString());
            }
    }
}
