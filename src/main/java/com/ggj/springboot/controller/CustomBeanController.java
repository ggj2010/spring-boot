package com.ggj.springboot.controller;

import com.ggj.springboot.configbean.CustomBean;
import com.ggj.springboot.configbean.SpringHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:gaoguangjin
 * @date:2018/10/26
 */
@RestController
public class CustomBeanController {

    @RequestMapping("/addbean")
    public String getBean(){
        return ((CustomBean)SpringHolder.getApplicationContext().getBean("customBean")).test();
    }
}
