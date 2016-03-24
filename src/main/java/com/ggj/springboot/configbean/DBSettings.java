package com.ggj.springboot.configbean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2016/2/19 15:34
 */
@Component
@Configuration
//属性的前缀
@ConfigurationProperties(prefix="db")
public class DBSettings {
    private String url;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
