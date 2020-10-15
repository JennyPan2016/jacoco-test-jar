package com.yanfuchang.controller;


import com.yanfuchang.bean.Jacoco;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/old_jacoco4")
public class JacocoController4 {

    @ResponseBody
    @RequestMapping(value = "/test4", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco41(
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
    @RequestMapping(value = "/add4", method=RequestMethod.POST, consumes = "application/json")
    public String jacoco42(
            @RequestBody Jacoco jacoco
    ){
        if ("add".equals(jacoco.getData())) {
            return "add";
        }
        return "need add";
    }
}
