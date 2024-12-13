package com.example.springkadaitodo.repository;

import com.example.springkadaitodo.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Integer> {
}
