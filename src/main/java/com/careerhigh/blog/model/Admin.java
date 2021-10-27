package com.careerhigh.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private long adminId;
    private String name;
    private String phoneNumber;
    private String pincode;

    public Admin() {}

    public Admin(long adminId, String name, String phoneNumber, String pincode) {
        this.adminId = adminId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
