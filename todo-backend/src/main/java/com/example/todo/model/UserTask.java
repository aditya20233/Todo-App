package com.example.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_Task")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Task_Id")
    Integer taskId;

    @Column(name = "User_Id")
    Integer userId;

    @Column(name = "Task_Name")
    String taskName;
}
