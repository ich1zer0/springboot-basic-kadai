package com.example.springkadaitodo.controller;

import com.example.springkadaitodo.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    private final ToDoService toDoService;

    @GetMapping("/todo")
    public String showTodo(Model model) {
        model.addAttribute("todos", toDoService.getAllTodos());

        return "todoView";
    }
}
