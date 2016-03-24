package com.ggj.springboot.runners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 13:56
 */
@Slf4j
public class TestConfigValueRunner implements CommandLineRunner {
    @Value("${user.id}")
    private String userId;
    @Value("${user.count}")
    private int userCount;
    @Value("${user.max}")
    private long userMax;
    @Value("${user.number}")
    private int userNumber;
    @Override
    public void run(String... args) throws Exception {
        log.info("userId="+userId);
        log.info("userCount="+userCount);
        log.info("userMax="+userMax);
        log.info("userNumber="+userNumber);
    }
}
