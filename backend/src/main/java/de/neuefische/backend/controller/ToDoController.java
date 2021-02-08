package de.neuefische.backend.controller;

import de.neuefische.backend.models.Todo;
import org.springframework.web.bind.annotation.*;
import de.neuefische.backend.services.ToDoServices;

import java.util.List;

// url ending "/api/todo"
// url ending in board: forked into three sub-pages
// der de.neuefische.backend.controller

@RestController
@RequestMapping("api/todo")
public class ToDoController {

    private ToDoServices toDoServices;

    public ToDoController(ToDoServices toDoServices) {
        this.toDoServices = toDoServices;
    }

    @GetMapping
    public List<Todo> getToDos(){
       return toDoServices.getToDos();

    }

    @PutMapping("{id}")
    public Todo advanceToDo(@RequestBody Todo toDoToAdvance){
        toDoServices.setStatusInDb(toDoToAdvance);
        return toDoToAdvance;
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo newToDo){
        //description und status werden übergeben im body
        return toDoServices.addToDo(newToDo.getDescription(), newToDo.getStatus());
    }
}
