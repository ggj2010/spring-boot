package com.ggj.springboot.database.h2.dao;

import com.ggj.springboot.bean.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Book;
import java.io.Serializable;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 17:43
 */
//CrudRepository
public interface StudentDAO extends PagingAndSortingRepository<Student, Long> {
}
