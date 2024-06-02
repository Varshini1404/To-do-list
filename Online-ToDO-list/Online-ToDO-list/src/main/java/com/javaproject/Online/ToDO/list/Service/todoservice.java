package com.javaproject.Online.ToDO.list.Service;

import com.javaproject.Online.ToDO.list.Entity.todolist;

import java.util.List;

public interface todoservice {
    List<todolist> getAlltodolists();

     todolist saveTodo(todolist todoList);
     todolist getTodoById(Long id);
     todolist updateTodo(todolist todoList);

     void deletetodoById(Long id);
}
