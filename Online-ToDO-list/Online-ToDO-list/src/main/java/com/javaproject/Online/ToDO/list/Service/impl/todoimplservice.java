package com.javaproject.Online.ToDO.list.Service.impl;

import com.javaproject.Online.ToDO.list.Entity.todolist;
import com.javaproject.Online.ToDO.list.Repository.todorepo;
import com.javaproject.Online.ToDO.list.Service.todoservice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class todoimplservice implements todoservice {
    private todorepo todoRepo;

    public todoimplservice(todorepo todoRepo) {
        this.todoRepo = todoRepo;
    }

    @Override
    public List<todolist> getAlltodolists()
    {

        return todoRepo.findAll();
    }


    public todolist saveTodo(todolist todoList)
    {
        return todoRepo.save(todoList);
    }
    @Override
     public todolist getTodoById(Long id)
    {
        return todoRepo.findById(id).get();
    }
    @Override
    public todolist updateTodo(todolist todoList)
    {
        return todoRepo.save(todoList);
    }

    @Override
    public void deletetodoById(Long id)
    {
              todoRepo.deleteById(id);
    }
}
