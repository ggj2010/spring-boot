package com.ggj.springboot.runners;

import com.ggj.springboot.bean.Student;
import com.ggj.springboot.configbean.DBSettings;
import com.ggj.springboot.database.h2.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * author:gaoguangjin
 * Description:测试数据库哈
 * Email:335424093@qq.com
 * Date 2016/2/19 17:53
 */
@Slf4j
public class TestH2Runner implements CommandLineRunner {
    @Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        Student student=studentService.findStudent();
        log.info(student.toString());
    }
}
