
package com.ggj.springboot.controller;

import com.ggj.springboot.bean.Person;
import com.ggj.springboot.bean.ResultInfo;
import com.ggj.springboot.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:gaoguangjin
 * @date:2018/9/7
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("json")
    public ResultInfo test(Person p) {
        ResultInfo resultInfo = new ResultInfo();
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setName("gao");
        person.setPhone(123213);
        Person person2 = new Person();
        person2.setName("cheng");
        person2.setPhone(237432804);

        personList.add(person);
        personList.add(person2);
        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setAge(90);
        student.setName("gao");

        studentList.add(student);

        Map<String, Object> map = new HashMap<>();
//        map.put("personList", personList);
//        map.put("studentList", studentList);
        map.put("hasBalance", true);

        resultInfo.data = map;
        return resultInfo;
    }
}
