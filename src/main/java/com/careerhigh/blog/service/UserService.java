package com.careerhigh.blog.service;

import com.careerhigh.blog.model.User;
import com.careerhigh.blog.model.UserResponse;
import com.careerhigh.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserResponse registerUser(User user) {
        if(userRepository.existsById(user.getUserId()))
            throw new RuntimeException("User already exists!!");
        return new UserResponse(userRepository.save(user).getUserId());
    }
}
