package com.javaproject.Online.ToDO.list.Controller;

import com.javaproject.Online.ToDO.list.Entity.todolist;
import com.javaproject.Online.ToDO.list.Service.todoservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Maincontroller {
    private todoservice todoService;

    public Maincontroller(todoservice todoService) {
        this.todoService = todoService;
    }

    @ModelAttribute("todo")
    public todolist create()
    {
        return new todolist();
    }
    //handler method to list todoist method and return mode and view
    @GetMapping("/index")
    public String listStudents(Model model)
    {
        model.addAttribute("n",todoService.getAlltodolists());
        return "index";
    }
    @GetMapping("/todolist/new")
    public String createtodo(Model model)
    {
             todolist todoList=new todolist();
             model.addAttribute("todo",todoList);
             return "todo_create";

    }
@PostMapping("/index")
    public String saveTodo(@ModelAttribute("todo") todolist todoList)
    {
           todoService.saveTodo(todoList);
           return "redirect:/index";
    }
    @GetMapping("/index/edit/{id}")
    public String editTodo(@PathVariable Long id, Model model )
    {
             model.addAttribute("todoList",todoService.getTodoById(id));
             return "todo_edit";
    }
    @PostMapping("/index/{id}")
    public String updateTodo(@PathVariable(value="id") Long id, @ModelAttribute("todo") todolist todoList , Model model) {
        //get
        todolist existingtodo = todoService.getTodoById(id);
        existingtodo.setId(id);
        existingtodo.setTitle(todoList.getTitle());
        existingtodo.setDescription(todoList.getDescription());
        existingtodo.setPriority(todoList.getPriority());
        existingtodo.setStatus(todoList.getStatus());
        existingtodo.setDuedate(todoList.getDuedate());

        //save updated
        todoService.updateTodo(existingtodo);
        return "redirect:/index";

    }
    @GetMapping("/index/{id}")
    public String deletetodo(@PathVariable Long id)
    {
todoService.deletetodoById(id);
return "redirect:/index";
    }


}
