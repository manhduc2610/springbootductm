package com.ductm.demo.service;

import com.ductm.demo.Model.User;
import com.ductm.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceIMPL implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
//        try {
//
////            return true;
//        }
//        catch (Exception exc){
////            return false;
//
//        }

    }
}
