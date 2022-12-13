package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{
     @Autowired
    UserRepository userRepository;
   @Override
    public ArrayList<User> get() {

       ArrayList<User>l=(ArrayList<User>)  userRepository.findAll();
       return l;

    }

    @Override
    public ArrayList<User> getAll(String name) {
        ArrayList<User>l= (ArrayList<User>) userRepository.findByLastnameIs(name);
        return l;
    }
    @Override
    public String saveUser(User user)
    {
        userRepository.save(user);
        return null;



    }

    @Override
    public ArrayList getI() {
        ArrayList l= (ArrayList) userRepository.fun1();
        return l;
    }

}
