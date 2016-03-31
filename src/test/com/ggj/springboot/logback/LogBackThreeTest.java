package com.ggj.springboot.logback;

import com.ggj.springboot.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author:gaoguangjin
 * @Description:  测试的时候将active profile 改成logtest3
 * @Email:335424093@qq.com
 * @Date 2016/3/31 16:23
 */
public class LogBackThreeTest extends BaseTest{
    @Autowired
    private LogBackThree logBackThree;
    @Test
    public void testShowLog() throws Exception {
        logBackThree.showLog();
    }
}