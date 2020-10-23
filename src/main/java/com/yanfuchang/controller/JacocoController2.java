package com.yanfuchang.controller;


import com.yanfuchang.bean.Jacoco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/old_jacoco2")
public class JacocoController2 {

    @ResponseBody
    @RequestMapping(value = "/test2", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco(
            @RequestBody Jacoco jacoco
    ){
        if ("daling".equals(jacoco.getData())) {
            return "daling";
        }else if ("dalingjia2".equals(jacoco.getData())){
            return "dalingjia";
        }else if ("test2".equals(jacoco.getData())){
            return "add test2";
        }else if ("test3".equals(jacoco.getData())){
            return "add test3";
        }
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/add", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco2(
            @RequestBody Jacoco jacoco
    ){
        if ("add".equals(jacoco.getData())) {
            return "add";
        }
        return "need add";
    }
}
