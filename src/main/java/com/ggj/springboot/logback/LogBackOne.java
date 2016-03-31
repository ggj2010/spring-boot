package com.ggj.springboot.logback;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author:gaoguangjin
 * @Description: 测试的时候 修改profile的值为logtest
 * @Email:335424093@qq.com
 * @Date 2016/3/31 13:56
 */

@Component
@Slf4j
public class LogBackOne {

    public void showLog(){
        log.debug("LogBackTestOne debug");
        log.info("LogBackTestOne info");
        log.error("LogBackTestOne error");
    }
}
