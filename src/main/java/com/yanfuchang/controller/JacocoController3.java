package com.yanfuchang.controller;


import com.yanfuchang.bean.Jacoco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/old_jacoco3")
public class JacocoController3 {

    @ResponseBody
    @RequestMapping(value = "/test3", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco31(
            @RequestBody Jacoco jacoco
    ){
        if ("daling".equals(jacoco.getData())) {
            return "daling";
        }else if ("dalingjia".equals(jacoco.getData())){
            return "dalingjia";
        }else if ("add".equals(jacoco.getData())){
            return "add";
        }
        return "Hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/add3", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco32(
            @RequestBody Jacoco jacoco
    ){
        if ("add".equals(jacoco.getData())) {
            return "add";
        }
        return "need add";
    }
}
