package com.example.repository;

import com.example.model.UserTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTaskRepository extends JpaRepository<UserTask, Integer> {
}
