package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;

public interface TodoService
{
  Todo updateTodo(Todo todo, long todoid);
}
