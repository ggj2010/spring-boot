package com.ggj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * author:gaoguangjin
 * Description:
 * Email:335424093@qq.com
 * Date 2015/12/25 14:50
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(Model model, @RequestParam(name = "name",defaultValue = "gaoguangjin",required = false)String name){
        model.addAttribute("name",name);
    return "hellow";
    }

}
