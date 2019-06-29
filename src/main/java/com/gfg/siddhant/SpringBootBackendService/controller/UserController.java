package com.gfg.siddhant.SpringBootBackendService.controller;

import com.gfg.siddhant.SpringBootBackendService.model.User;
import com.gfg.siddhant.SpringBootBackendService.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userDaoService;

    // CRUD

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userDaoService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return userDaoService.findUserById(id);
    }

    @PutMapping("/users")
    public void createUser(@RequestBody User user){
        userDaoService.updateUser(user);
        return;
    }

    @PostMapping("/users")
    public void updateUser(@RequestBody User user){
        userDaoService.createUser(user);
        return;
    }

    @DeleteMapping("/users/{id}")
    public  void deletUser(@PathVariable Long id){
        userDaoService.deleteUser(id);
        return;
    }


}
