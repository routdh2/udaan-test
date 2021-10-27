package com.careerhigh.blog.controller;

import com.careerhigh.blog.model.Risk;
import com.careerhigh.blog.model.User;
import com.careerhigh.blog.model.UserResponse;
import com.careerhigh.blog.service.RiskService;
import com.careerhigh.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RiskService riskService;

    @PostMapping("/registerUser")
    public UserResponse registerUser(User user) {
        if(user==null)
            return null;
        return userService.registerUser(user);
    }

    @PostMapping("/selfAssessment")
    public Risk selfAssessment(User user) {
        if(user==null)
            throw new RuntimeException("User is not provided!!");
        return new Risk(riskService.calculateRiskPercentage(user));
    }
}
