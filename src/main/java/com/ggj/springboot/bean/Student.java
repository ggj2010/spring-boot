package com.ggj.springboot.bean;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 17:03
 */
@Entity(name="tb_student")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToOne
    @JoinColumn(name = "class_room_id")
    private ClassRoom classRoom;

    public Student(){}

    public String toString(){
        return "student: name="+name+"  || teacher :name="+teacher.getName()+" classRooName="+classRoom.getName();
    }
}
