package com.gauravjalal.UserService.service;

import com.gauravjalal.UserService.entities.User;

import java.util.List;

public interface UserService {
    //create
    User saveUser(User user);
    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String UserId);
    //delete
    User deleteUser(String UserId);
    //update
    User updateuser(String userId);
}
