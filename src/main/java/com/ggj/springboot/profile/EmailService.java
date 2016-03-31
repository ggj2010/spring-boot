package com.ggj.springboot.profile;

/**
 * @author:gaoguangjin
 * @Description:利用@Profile() 在不同环境实例化不同的类
 * @Email:335424093@qq.com
 * @Date 2016/3/31 14:16
 */
public interface EmailService {
    void sendEmail();
}
