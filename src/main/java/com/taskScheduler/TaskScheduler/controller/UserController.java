package com.taskScheduler.TaskScheduler.controller;

import com.taskScheduler.TaskScheduler.custom.DeleteUser;
import com.taskScheduler.TaskScheduler.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/user")
public class UserController {

    // create , delete , update, get_user_details

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return null;
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        return null;
    }

    // should have a custom responce to tell it is deleted successfuly or and error occured ???
    // while deleting the user he/she should enter the username and password correcly again for confirmation
    // only the user himself and the admin will be able to delete the user
    // should have a seperate POJO for deletion and sent a req body
    @DeleteMapping("/delete")
    public ResponseEntity<User> deleteUser(@RequestBody DeleteUser deleteUser){
        return null;
    }

    @GetMapping("/{emailId}")
    public ResponseEntity<User> getUser(@PathVariable String emailId){
        return null;
    }
}
