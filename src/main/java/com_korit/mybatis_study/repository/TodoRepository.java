package com_korit.mybatis_study.repository;

import com_korit.mybatis_study.entity.Todo;
import com_korit.mybatis_study.mapper.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class TodoRepository {
    @Autowired
    private TodoMapper todoMapper;


    public int editTodo(Todo todo) {
        return todoMapper.editTodo(todo);
    }
    public int removeTodo(Integer todoId) {
        return todoMapper.editTodo(todoId);
    }
}
