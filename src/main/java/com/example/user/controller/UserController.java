package com.example.user.controller;

import com.example.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping(path = "user")
    public void addUser(@RequestBody @Valid String name, @RequestBody @Valid String surname) {
        userService.addUser(name, surname);
    }

    @GetMapping(path = "user/{id}")
    public void getUserById(@PathVariable("id") Long id) {
        userService.getUser(id);
    }

    @DeleteMapping(path = "/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.removeUser(id);
    }
}