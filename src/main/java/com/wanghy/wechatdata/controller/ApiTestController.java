package com.wanghy.wechatdata.controller;

import com.alibaba.fastjson.JSONObject;
import com.wanghy.wechatdata.vo.TodoVO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
@CrossOrigin
public class ApiTestController {

    @GetMapping("/str-test")
    public JSONObject strTest(@RequestParam("name") String name){
        JSONObject res = new JSONObject(true);
        res.put("code",200);
        res.put("name",name);
        return res;
    }

    @GetMapping("/todo")
    public TodoVO getTodo(){
        return TodoVO.builder().id(0).name("Http测试").state(false).build();
    }

}
