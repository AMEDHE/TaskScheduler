package com.taskScheduler.TaskScheduler.services.impl;

import com.taskScheduler.TaskScheduler.model.User;
import com.taskScheduler.TaskScheduler.repository.UserRepository;
import com.taskScheduler.TaskScheduler.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(String emailId) {
        User user = userRepository.findByEmail(emailId);
        userRepository.delete(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User getUser(String emailId) {
        return null;
    }


}
