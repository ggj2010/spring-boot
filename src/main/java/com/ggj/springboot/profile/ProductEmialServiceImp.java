package com.ggj.springboot.profile;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author:gaoguangjin
 * @Description: 模拟生成环境会进行发送email
 * @Email:335424093@qq.com
 * @Date 2016/3/31 14:18
 */
@Slf4j
@Profile("product")
@Service
public class ProductEmialServiceImp implements  EmailService {
    @Override
    public void sendEmail() {
        log.info("发送email");
    }
}
