package com.ggj.springboot.seconddemo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ggj.springboot.bean.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:gaoguangjin
 * Description:RestController注解，它继承自@Controller注解，当你实现一个RESTful web services的时候，response将一直通过response body发送
 * Email:335424093@qq.com
 * Date 2015/12/23 11:09
 */
@RestController
public class MyController {
    @RequestMapping(value = "rest")
    public String  test(){
        Message message=new Message();
        message.setName("gaoguangjin");
        message.setContent("自定义端口号，main方法启动");
        return JSONObject.toJSONString(message);
    }

}
