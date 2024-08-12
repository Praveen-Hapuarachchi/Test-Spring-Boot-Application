package com.ruhuna.Test.Spring.Boot.Application.controller;

import com.ruhuna.Test.Spring.Boot.Application.dto.UserDTO;
import com.ruhuna.Test.Spring.Boot.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }
    @PostMapping("/saveUser")
    public  UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);

    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }

    @GetMapping("/getUserByUserId/{userId}")
    public UserDTO getUserByUserID(@PathVariable String userId){
        return userService.getUserByUserID(userId);
    }
    
    @GetMapping("/getUserByUserIdAndAddress/{userId}/{address}")
    public UserDTO getUserByUserIdAndAddress(@PathVariable String userId ,@PathVariable String address){
        System.out.println("ÜserId : " + userId +" Address : " + address);
        return userService.getUserByUserIdAndAddress(userId ,address);
    }
}

