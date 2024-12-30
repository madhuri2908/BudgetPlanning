package com.example.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "User")
public class User {
    @Id
    private Long userId;
    private String name;
    private int salary;
    private int balance;
    private int expenses;
}
