package com.example.demo.controller;

import com.example.demo.service.UserRoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRoleService userRoleService;

    @PostMapping("/api/create/user")
    public User create(User user){
        return   userService.create(user);
    }
    @PutMapping("/api/update/user")
    public User update(User user){
        return userService.update(user);
    }
    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
    @GetMapping("/getAll/")
    public List<User> getAllUsers (){
        return userService.getAllUsers();
    }
    @DeleteMapping("/api/deleteUser/{id}")
    public void delete (@PathVariable Long id){
        userService.delete(id);
    }


}
