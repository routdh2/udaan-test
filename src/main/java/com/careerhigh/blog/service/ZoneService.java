package com.careerhigh.blog.service;

import com.careerhigh.blog.model.ZoneRequest;
import com.careerhigh.blog.model.ZoneResponse;
import com.careerhigh.blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneService {
    @Autowired
    private UserRepository userRepository;

    public ZoneResponse getZoneInfo(ZoneRequest zoneRequest) {

        return null;
    }
}
