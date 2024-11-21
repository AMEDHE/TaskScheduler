package com.taskScheduler.TaskScheduler.services;

import com.taskScheduler.TaskScheduler.model.User;

public interface UserService {

    public User createUser(User user);

    public User deleteUser(String emailId);

    public User updateUser(User user);

    public User getUser(String emailId);
}
