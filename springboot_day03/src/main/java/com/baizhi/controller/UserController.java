package com.baizhi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("findAll")
    public String findAll(){

        logger.debug("进入findall方法内。。。");

        return "index";
    }

    @RequestMapping("save")
    public String save(){
        logger.info("进入save方法内。。333");
        return "index";
    }
}
