package com_korit.mybatis_study.mapper;

import com_korit.mybatis_study.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoMapper {
    Optional<Todo> findTodoByTitle(String title);
    int addTodo (Todo todo);
    List<Todo> getTodoLost();                         //모든 todo 목록을 가져와줘
    Optional<Todo> findTodoByTodoId (Integer todoId); //“todo 번호로 게시글 하나를 찾아줘
    int editTodo(Todo todo);                        // “todo의 내용을 수정해 줘”
    int removeTodo (Integer todoId);            // “해당 번호의 todo를 삭제해 줘
}
