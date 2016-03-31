package com.ggj.springboot.profile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/3/31 14:18
 */
@Slf4j
@Profile("dev")
@Service
public class DevEmialServiceImp implements  EmailService{
    @Override
    public void sendEmail() {
        log.info("测试环境 donothing");
    }
}
