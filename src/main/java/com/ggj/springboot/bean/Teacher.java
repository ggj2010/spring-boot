package com.ggj.springboot.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 17:05
 */
@Entity(name="tb_teacher")
@Getter
@Setter
public class Teacher {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String job;
    public Teacher(){
    }
}
