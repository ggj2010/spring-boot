package com.ggj.springboot.logback;

import com.ggj.springboot.BaseTest;
import com.ggj.springboot.MainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/3/31 13:59
 */
public class LogBackOneTest extends BaseTest {
    @Autowired
    private LogBackOne logBackOne;
    @Test
    public void testShowLog() throws Exception {
        logBackOne.showLog();
    }
}