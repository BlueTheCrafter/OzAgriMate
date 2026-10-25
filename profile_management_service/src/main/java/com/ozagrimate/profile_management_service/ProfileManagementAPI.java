package com.ozagrimate.profile_management_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/user-record")
public class ProfileManagementAPI {
    ProfileManagerServiceLayer profileManagerServiceLayer;

    public ProfileManagementAPI() {
        profileManagerServiceLayer = new ProfileManagerServiceLayer();
    }

    @PostMapping("/add-user") 
    public ResponseEntity<UserProfile> addUserProfile(@RequestBody UserProfile userProfileRequest) {
        UserProfile userprofile = profileManagerServiceLayer.createUserProfile(userProfileRequest);
        return ResponseEntity.ok(userprofile);
    }

}
