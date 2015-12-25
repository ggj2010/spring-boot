package com.ggj.springboot.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * author:gaoguangjin
 * Description:lombok 在idea里面直接搜索这个插件就可以使用了
 * Email:335424093@qq.com
 * Date 2015/12/23 11:24
 */
@Setter
@Getter
public class Message {
    private Long id;
    private String name;
    private String content;
}
