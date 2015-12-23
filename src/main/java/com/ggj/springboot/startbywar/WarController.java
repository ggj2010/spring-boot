package com.ggj.springboot.startbywar;

import com.alibaba.fastjson.JSONObject;
import com.ggj.springboot.bean.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2015/12/23 15:08
 */
@RestController
public class WarController {
    @RequestMapping(value = "war")
    public String  test(){
        Message message=new Message();
        message.setName("gaoguangjin");
        message.setContent("spring boot推荐的方式是将main方法所在的类放在应用包结构的根目录，这样@ComponentScan不用配置任何包路径，便能正常扫描到所有注解,不然只会扫描main方法所在的目录以及子目录");
        return JSONObject.toJSONString(message);
    }
}
