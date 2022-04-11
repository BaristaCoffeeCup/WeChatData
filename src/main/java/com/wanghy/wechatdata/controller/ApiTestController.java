package com.wanghy.wechatdata.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ApiTestController {

    @GetMapping("/str-test")
    public JSONObject strTest(@RequestParam("name") String name){
        JSONObject res = new JSONObject(true);
        res.put("code",200);
        res.put("name",name);
        return res;
    }

}
