package com.careerhigh.blog.model;

public class ZoneRequest {
    private String pincode;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public ZoneRequest(String pincode) {
        this.pincode = pincode;
    }
}
