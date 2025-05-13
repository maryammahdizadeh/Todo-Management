package com.example.todo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodoDto {

    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
