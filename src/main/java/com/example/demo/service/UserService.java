package com.example.demo.service;

import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


public interface UserService
{
   public ArrayList<User> get();
    ArrayList<User> getAll(String name);
    public String saveUser(User user);
    public ArrayList getI();

}
