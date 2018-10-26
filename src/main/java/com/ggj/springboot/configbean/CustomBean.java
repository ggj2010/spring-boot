
package com.ggj.springboot.configbean;

/**
 * @author:gaoguangjin
 * @date:2018/10/26
 */
public class CustomBean {
    private RefrenceBean refrenceBean;

    public RefrenceBean getRefrenceBean() {
        return refrenceBean;
    }

    public void setRefrenceBean(RefrenceBean refrenceBean) {
        this.refrenceBean = refrenceBean;
    }

    public String test() {
        return "customBean";
    }
}
