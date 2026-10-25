package com.ozagrimate.profile_management_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

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

    @PutMapping ("/update-user/role/{userId}") 
    public ResponseEntity<UserProfile> updateUserProfileRole(@PathVariable int userId, @RequestBody ChangeRoleRequest changeRoleRequest) {
        UserProfile updatedUserProfile = profileManagerServiceLayer.changeUserProfileRole(userId, changeRoleRequest);
        if (updatedUserProfile != null) {
            return ResponseEntity.ok(updatedUserProfile);
        } 
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping ("/update-user/language/{userId}")
    public ResponseEntity<UserProfile> updateUserProfileLanguage(@PathVariable int userId, @RequestBody ChangeLanguageRequest changeLanguageRequest) {
        UserProfile updatedUserProfile = profileManagerServiceLayer.changeUserProfileLanguage(userId, changeLanguageRequest);
        if (updatedUserProfile != null) {
            return ResponseEntity.ok(updatedUserProfile);
        } 
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
