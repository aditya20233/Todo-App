package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import com.example.repository.UserTaskRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserTaskRepository userTaskRepository;

    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
