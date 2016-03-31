package com.ggj.springboot.profile;

import com.ggj.springboot.BaseTest;
import com.ggj.springboot.MainApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author:gaoguangjin
 * @Description: 修改application.yml 可以看到不同效果，将active: product或者dev
 * @Email:335424093@qq.com
 * @Date 2016/3/31 14:21
 */
public class EmailServiceTest extends BaseTest {
    /**
     * 根据active的profile 选择要实现的类
     */
    @Autowired
    private EmailService emailService;

    @Test
    public void testSendEmail() throws Exception {
        emailService.sendEmail();
    }
}