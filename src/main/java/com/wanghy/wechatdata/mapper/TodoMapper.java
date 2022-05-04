package com.wanghy.wechatdata.mapper;

import com.wanghy.wechatdata.entity.Todo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Select("<script>" +
            "select * from todo WHERE is_deleted = 0" +
            "</script>")
    List<Todo> getTodos();

    @Insert("<script>" +
            "INSERT INTO todo(name,state,is_deleted) VALUES(#{name},false,false)" +
            "</script>")
    Integer addTodo(@Param("name") String name);

    @Delete("UPDATE todo SET is_deleted = true WHERE id = #{id}")
    void removeTodo(@Param("id") Integer id);

    @Update("UPDATE todo SET state = (1-state) WHERE id = #{id}")
    void updateTodoState(@Param("id") Integer id);

}
