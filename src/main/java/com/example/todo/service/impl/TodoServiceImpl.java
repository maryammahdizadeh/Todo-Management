package com.example.todo.service.impl;

import com.example.todo.dto.TodoDto;
import com.example.todo.entity.Todo;
import com.example.todo.repository.TodoRepository;
import com.example.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    private ModelMapper modelMapper;

    @Override
    public TodoDto addTodo(TodoDto todoDto) {

        // convert TodoDto into Todo Jpa entity
        Todo todo = modelMapper.map(todoDto, Todo.class);

        // save Todo Jpa entity into database
        Todo savedTodo = todoRepository.save(todo);

        // Convert saved Todo Jpa entity object into TodoDto object

        return modelMapper.map(savedTodo, TodoDto.class);
    }
}
