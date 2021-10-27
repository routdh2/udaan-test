package com.careerhigh.blog.controller;

import com.careerhigh.blog.model.*;
import com.careerhigh.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/registerAdmin")
    public AdminResponse registerAdmin(Admin admin) {
        return adminService.registerAdmin(admin);
    }

    @PostMapping("/updateCovidResult")
    public CovidResponse updateCovidResult(CovidRequest request) {
        return adminService.updateCovidResult(request);
    }
}
