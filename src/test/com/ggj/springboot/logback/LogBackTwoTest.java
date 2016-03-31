package com.ggj.springboot.logback;

import com.ggj.springboot.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author:gaoguangjin
 * @Description: 将active profil改成logtest2
 * @Email:335424093@qq.com
 * @Date 2016/3/31 15:49
 */
public class LogBackTwoTest extends BaseTest {
    @Autowired
    private LogBackOne logBackOne;
    @Autowired
    private LogBackTwo logBackTwo;
    @Test
    public void testShowLog() throws Exception {
        logBackOne.showLog();
        logBackTwo.showLog();
    }
}