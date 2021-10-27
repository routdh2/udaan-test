package com.careerhigh.blog.service;

import com.careerhigh.blog.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiskService {

    public int calculateRiskPercentage(User user) {

        List<String> symptoms = user.getSymptoms();
        boolean travelHistory = user.isTravelHistory();
        boolean contactWithCovidPatient = user.isContactWithCovidPatient();

        if(symptoms.size()>2 && (travelHistory || contactWithCovidPatient))
            return 95;
        else if(symptoms.size()>1 && (travelHistory || contactWithCovidPatient))
            return 75;
        else if(symptoms.size()>0 && (travelHistory || contactWithCovidPatient))
            return 50;
        else if(symptoms.size()==0 && !travelHistory && !contactWithCovidPatient)
            return 5;
        return 0;
    }
}
