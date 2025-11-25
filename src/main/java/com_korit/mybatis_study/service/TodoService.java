package com_korit.mybatis_study.service;

import com_korit.mybatis_study.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

}
