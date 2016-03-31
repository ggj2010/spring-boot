package com.ggj.springboot.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author:gaoguangjin
 * @Description: 测试的修改active profie 改成logtest3
 * @Email:335424093@qq.com
 * @Date 2016/3/31 16:21
 */
@Component
@Slf4j
public class LogBackThree {
    @Autowired
    private LogBackOne logBackOne;
    @Autowired
    private LogBackTwo logBackTwo;

    public void showLog(){
        logBackOne.showLog();
        logBackTwo.showLog();
    }
}
