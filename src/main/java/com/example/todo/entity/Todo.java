package com.example.todo.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Todo {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
