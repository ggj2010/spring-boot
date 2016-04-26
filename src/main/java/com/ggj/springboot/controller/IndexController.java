package com.ggj.springboot.controller;

import com.ggj.springboot.bean.Student;
import com.ggj.springboot.database.h2.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2015/12/25 14:50
 */
@Controller
@Slf4j
public class IndexController {
    @Autowired
    private StudentService studentService;


    private AtomicInteger atomicInteger = new AtomicInteger();

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model, @RequestParam(name = "name", defaultValue = "gaoguangjin", required = false) String name) throws InterruptedException {
        model.addAttribute("name", name);
        System.out.println("atomicInteger=" + atomicInteger.incrementAndGet() + "======" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
        Thread.sleep(1000);
        return "hellow";
    }

    @RequestMapping(value = "transation", method = RequestMethod.GET)
    public String transation(Model model, @RequestParam(name = "name", defaultValue = "gaoguangjin", required = false) String name) {
        Student students = new Student();
        students.setName("学生" + atomicInteger.addAndGet(1));
        students.setAge(20);
        studentService.save(students);
        return "hellow";
    }

    @RequestMapping(value = "log")
    public String testLog() {
        log.error("error级别==========");
        log.warn("warn级别==========");
        log.info("info级别==========");
        log.debug("debug级别==========");
        log.trace("trace级别==========");
        return "hellow";
    }

}
