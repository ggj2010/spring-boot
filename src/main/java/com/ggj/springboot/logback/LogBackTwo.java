package com.ggj.springboot.logback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/3/31 15:40
 */
@Component
@Slf4j
public class LogBackTwo {
    public void showLog(){
        log.debug("LogBackTwo debug");
        log.info("LogBackTwo info");
        log.error("LogBackTwo error");
    }
}
