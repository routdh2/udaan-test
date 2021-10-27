package com.careerhigh.blog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {
    @Id
    private long userId;
    private String name;
    private String phoneNumber;
    private String pincode;
    //todo move these to diffrent class
    private List<String> symptoms;
    private boolean travelHistory;
    private boolean contactWithCovidPatient;
    private String result;

    public User(long userId, String name, String phoneNumber, String pincode, List<String> symptoms, boolean travelHistory, boolean contactWithCovidPatient, String result) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
        this.symptoms = symptoms;
        this.travelHistory = travelHistory;
        this.contactWithCovidPatient = contactWithCovidPatient;
        this.result = result;
    }

    public User(){}

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isContactWithCovidPatient() {
        return contactWithCovidPatient;
    }

    public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
        this.contactWithCovidPatient = contactWithCovidPatient;
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
