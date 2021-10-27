package com.careerhigh.blog.controller;

import com.careerhigh.blog.model.User;
import com.careerhigh.blog.model.ZoneRequest;
import com.careerhigh.blog.model.ZoneResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZoneController {

    @PostMapping("/getZoneInfo")
    public ZoneResponse getZoneInfo(ZoneRequest request) {
        //check if user exists already
        //insert to db
        return null;
    }
}
