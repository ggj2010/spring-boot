package com.ggj.springboot.event;

import com.ggj.springboot.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author:gaoguangjin
 * @date 2016/9/1 10:42
 */
public class EventAwareTest extends BaseTest{
    @Autowired
    private  EventAware eventAware;
    @Test
    public void sendContent(){
        ContentEvent contentEvent=new ContentEvent("spring Event 测试");
        eventAware.sendContent(contentEvent);
    }
}