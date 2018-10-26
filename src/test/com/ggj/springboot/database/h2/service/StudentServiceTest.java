package com.ggj.springboot.database.h2.service;

import com.ggj.springboot.BaseTest;
import com.ggj.springboot.MainApplication;
import com.ggj.springboot.bean.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.TransientDataAccessResourceException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * author:gaoguangjin
 * Description:不填写配置项默认走的H2内存数据库，内存数据库的事务貌似没作用啊
 * Email:335424093@qq.com
 * Date 2016/3/24 16:37
 */
public class StudentServiceTest extends BaseTest {

    @Autowired
    private StudentService studentService;
    @Test
    public void testSave() throws Exception {
        Student students=new Student();
        students.setName("学生测试事务readonly=false");
        students.setAge(21);
        students=studentService.save(students);
    }

    @Test(expected = JpaSystemException.class)
    public void testSaveReadonly() throws Exception {
        Student students=new Student();
        students.setName("学生测试事务readonly=true");
        students.setAge(22);
        students=studentService.saveReadonly(students);
    }

    @Test(expected =NumberFormatException.class)
    public void testTransaction() throws Exception {
        Student students=new Student();
        students.setName("学生测试事务transaction");
        students.setAge(23);
        students=studentService.transaction(students);
    }

    @After
    public void display(){
        List<Student> studentList=studentService.findall();
        studentList.forEach((Student student)->{
            System.out.println("student======================================="+student.getName());
        });
    }
}