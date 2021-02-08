package de.neuefische.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Todo {
    private String id;
    private String description;
    private String status;


}
