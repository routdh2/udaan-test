package com.careerhigh.blog.model;

public class UserResponse {

    private Long userId;

    public UserResponse(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
