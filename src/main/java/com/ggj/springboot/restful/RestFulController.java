package com.ggj.springboot.restful;

import com.ggj.springboot.bean.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * author:gaoguangjin
 * Description: http://localhost:8080/springboot/hellow/restfulTest?name=gaoguangjin
 * Email:335424093@qq.com
 * Date 2015/12/25 12:37
 */
@RestController
public class RestFulController {
    private AtomicLong atomicLong=new AtomicLong();

    @RequestMapping(value = "hellow/{content}")
    public Message hello(@RequestParam(value ="name",defaultValue = "gaoguagnjin",required = false) String name, @PathVariable String content){
        Message message=new Message();
        message.setName(name);
        message.setId(atomicLong.get());
        message.setContent(content);
        atomicLong.incrementAndGet();
        return message;
    }

}
