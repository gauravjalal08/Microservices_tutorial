package com.gauravjalal.UserService.service.imp;

import com.gauravjalal.UserService.entities.User;
import com.gauravjalal.UserService.exception.ResourceNotFound;
import com.gauravjalal.UserService.repository.UserRepository;
import com.gauravjalal.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
      String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String UserId) {
        return userRepository.findById(UserId).orElseThrow(() -> new ResourceNotFound("user with the given id is not Found on server!! " +UserId));
    }

    @Override
    public User deleteUser(String UserId) {
        return null;
    }

    @Override
    public User updateuser(String userId) {
        return null;
    }
}
