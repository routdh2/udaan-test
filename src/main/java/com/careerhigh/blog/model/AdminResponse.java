package com.careerhigh.blog.model;

public class AdminResponse {

    private Long adminId;

    public AdminResponse(Long adminId) {
        this.adminId = adminId;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }
}
