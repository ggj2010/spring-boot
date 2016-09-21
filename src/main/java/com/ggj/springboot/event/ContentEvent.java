package com.ggj.springboot.event;


import org.springframework.context.ApplicationEvent;

/**
 * 自定义event
 * @author:gaoguangjin
 * @date 2016/9/1 9:58
 */
public class ContentEvent extends ApplicationEvent {
    public ContentEvent(String source) {
        super(source);
    }
}
