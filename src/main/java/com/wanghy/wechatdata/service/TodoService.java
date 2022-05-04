package com.wanghy.wechatdata.service;

import com.wanghy.wechatdata.entity.Todo;
import com.wanghy.wechatdata.mapper.TodoMapper;
import com.wanghy.wechatdata.vo.TodoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoMapper todoMapper;

    public List<TodoVO> getTodos(){
        List<Todo> todos = todoMapper.getTodos();

        List<TodoVO> todoVOS = new ArrayList<>();

        for(Todo todo:todos){
            todoVOS.add(TodoVO.builder().id(todo.getId()).name(todo.getName()).state(todo.isState()).build());
        }

        return todoVOS;
    }

    public List<TodoVO> addTodo(String name){
        if(!name.trim().equals("")){
            todoMapper.addTodo(name);
        }
        return getTodos();
    }

    public void updateState(Integer id){
        todoMapper.updateTodoState(id);
    }

    public void removeTodo(Integer id){
        todoMapper.removeTodo(id);
    }

}
