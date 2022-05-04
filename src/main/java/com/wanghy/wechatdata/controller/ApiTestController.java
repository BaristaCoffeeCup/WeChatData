package com.wanghy.wechatdata.controller;

import com.alibaba.fastjson.JSONObject;
import com.wanghy.wechatdata.service.TodoService;
import com.wanghy.wechatdata.vo.TodoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@CrossOrigin
@Slf4j
public class ApiTestController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/str-test")
    public JSONObject strTest(@RequestParam("name") String name){
        JSONObject res = new JSONObject(true);
        res.put("code",200);
        res.put("name",name);
        return res;
    }

    @GetMapping("/todo")
    public List<TodoVO> getTodo(){
        return todoService.getTodos();
    }

    @PostMapping("/todo")
    public List<TodoVO> addTask(@RequestParam("name") String name){
        log.info("[新增Todo]新增数据:{}",name);
        return todoService.addTodo(name);
    }

    @DeleteMapping("/todo")
    public void deleteTodo(@RequestParam("id") Integer id){
        log.info("删除Todo id:{}",id);
        todoService.removeTodo(id);
    }

    @PatchMapping("/todo")
    public void updateTodo(@RequestParam("id") Integer id){
        log.info("修改todo状态");
        todoService.updateState(id);
    }

}
