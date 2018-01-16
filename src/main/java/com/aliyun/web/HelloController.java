package com.aliyun.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 程序猿DD
 * @version 1.0.0
 * @blog http://blog.aliyun.com
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.aliyun.com");
        return "index";
    }

}