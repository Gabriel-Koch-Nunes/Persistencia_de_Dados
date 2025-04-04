package com.exemplo.tarefas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentMongo {

    @Id
    private String id; // MongoDB usa String (ObjectId)

    @NotBlank(message = "O título não pode estar vazio")
    private String title;

    @NotBlank(message = "A descrição não pode estar vazia")
    private String description;

    private boolean active;
}