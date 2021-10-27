package com.careerhigh.blog.service;

import com.careerhigh.blog.model.*;
import com.careerhigh.blog.repository.AdminRepository;
import com.careerhigh.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    public AdminResponse registerAdmin(Admin admin) {
        if(adminRepository.existsById(admin.getAdminId()))
            throw new RuntimeException("Admin already exists!!");
        return new AdminResponse(adminRepository.save(admin).getAdminId());
    }

    public CovidResponse updateCovidResult(CovidRequest request) {
        Long userId = request.getUserId();
        //check if user exists
        if(!userRepository.existsById(userId))
            throw new RuntimeException("User doesn't exist!!");
        User user = (User)userRepository.findById(userId).orElse(null);
        user.setResult(request.getResult());
        userRepository.save(user);
        return new CovidResponse(true);
    }
}
