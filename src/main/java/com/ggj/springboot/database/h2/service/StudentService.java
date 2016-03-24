package com.ggj.springboot.database.h2.service;

import com.ggj.springboot.bean.Student;
import com.ggj.springboot.database.h2.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 17:47
 */
@Service
@Transactional(readOnly = true)
public class StudentService {
    @Autowired
    private StudentDAO studentDAO;

    public Student findStudent(){
        return  studentDAO.findOne(1l);
    }

    @Transactional(readOnly = false)
    public Student save(Student student){
        student=studentDAO.save(student);
        return student;
    }

    @Transactional(readOnly = true)
    public Student saveReadonly(Student student){
        student=studentDAO.save(student);
        return student;
    }

    @Transactional(readOnly = false)
    public Student transaction(Student student){
        student=studentDAO.save(student);
        Integer.parseInt("dd");
        return student;
    }


    public List<Student> findall(){
        List<Student>  studentList= (List<Student>) studentDAO.findAll();
        return studentList;
    }
}
