package de.neuefische.backend.services;

import de.neuefische.backend.db.TodoDb;
import de.neuefische.backend.models.Todo;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ToDoServices {

    private TodoDb todoDb;


    public ToDoServices(TodoDb todoDb) {
        this.todoDb = todoDb;
    }

    public List<Todo> getToDos() {
        return todoDb.getTodoDbList();
    }


    public void setStatusInDb(Todo toDoToAdvance) {
        for (Todo todo : todoDb.getTodoDbList()) {
            if (todo.getId().equals(toDoToAdvance.getId())) {
                todo.setStatus(toDoToAdvance.getStatus());
            }
        }
    }

    public Todo addToDo(String description, String status){
        Todo newTodo = new Todo((UUID.randomUUID().toString()), description, status);
        todoDb.add(newTodo);
        return newTodo;

    }
}
