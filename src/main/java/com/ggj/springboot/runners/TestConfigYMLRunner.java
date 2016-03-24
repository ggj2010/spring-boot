package com.ggj.springboot.runners;

import com.ggj.springboot.configbean.DBSettings;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * author:gaoguangjin
 * Description: 不同的profie显示不同的值
 * Email:335424093@qq.com
 * Date 2016/2/19 15:02
 */
@Slf4j
public class TestConfigYMLRunner implements CommandLineRunner {

   @Autowired
   private DBSettings dBSettings;

    @Override
    public void run(String... args) throws Exception {
        log.info("url="+dBSettings.getUrl());
        log.info("password="+dBSettings.getPassword());
        log.info("userName="+dBSettings.getUsername());
    }
}
