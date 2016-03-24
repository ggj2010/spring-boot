package com.ggj.springboot.runners;

import com.ggj.springboot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * author:gaoguangjin
 * Description:测试spring bean生命周期
 * Email:335424093@qq.com
 * Date 2016/2/19 11:38
 */
public class TestConfigBeanRunner implements CommandLineRunner {
    @Autowired
    private Person person;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(person);
    }
}
