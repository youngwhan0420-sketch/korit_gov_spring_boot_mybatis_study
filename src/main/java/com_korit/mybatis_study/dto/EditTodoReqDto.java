package com_korit.mybatis_study.dto;

import com_korit.mybatis_study.entity.Todo;

public class EditTodoReqDto {
    private Integer todoId;
    private String title;
    private String content;

    public Todo toEntity() {
        return Todo.builder()
                .todoId(todoId)
                .title(title)
                .content(content)
                .build();
    }
}
