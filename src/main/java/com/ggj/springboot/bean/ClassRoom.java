package com.ggj.springboot.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 17:13
 */
@Entity(name="tb_class_room")
@Getter
@Setter
public class ClassRoom {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @Column(name = "room_size")
    private int roomSize;

    @JsonIgnore
    @OneToMany(mappedBy = "classRoom", cascade = { javax.persistence.CascadeType.REMOVE })
    private List<Student> listStudent;
    public ClassRoom(){}
}
