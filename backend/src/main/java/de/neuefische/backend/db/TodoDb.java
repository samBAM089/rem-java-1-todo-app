package de.neuefische.backend.db;

import de.neuefische.backend.models.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoDb {

    private List<Todo> todoDbList = new ArrayList<>(List.of(
            new Todo("976f37f4-8aa7-481d-ad2c-2120613f3347", "Write tests", "OPEN"),
            new Todo("61084198-b1b7-4d7c-837c-62f458ce765a", "Drink coffee", "OPEN"),
            new Todo("4f5cf145-d5f7-430f-8e0e-048ea3c1fc68", "Buy milk", "DONE")
    ));

    public List<Todo> getTodoDbList() {
        return todoDbList;
    }

    public void add(Todo newTodo){
        todoDbList.add(newTodo);

    }


}
