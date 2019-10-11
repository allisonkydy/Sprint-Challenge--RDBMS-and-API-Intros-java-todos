package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "todoService")
public class TodoServiceImpl implements TodoService
{
  @Autowired
  private TodoRepository todorepos;

  @Override
  public Todo updateTodo(Todo todo, long todoid)
  {
    return todorepos.save(todo);
  }
}
