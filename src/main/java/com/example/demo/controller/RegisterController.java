package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RegisterController
{


    @Autowired
    UserService userService;
    @PostMapping("/save")
    public String  userDetails(@RequestBody User user)
    {
        userService.saveUser(user);
        return "hi";
    }
    @GetMapping("/ijoin")
    public ArrayList getJoin()
    {
        ArrayList l=userService.getI();


        return l;
    }

   /** @GetMapping("/getall")
    public ArrayList<User> getReqeustall(@RequestParam("name") String name)
    {
        ArrayList<User> l = userService.getAll(name);
        return l;
    }
*/
    @GetMapping("/get")
    public ArrayList<User> get()
    {
        return userService.get();
    }
}
