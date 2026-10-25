package com.ozagrimate.profile_management_service;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class ProfileManagerServiceLayer {
    private List<UserProfile> userProfiles = new ArrayList<>();

    public ProfileManagerServiceLayer() {
        createDummyProfiles();
    }

    public final void createDummyProfiles() {
        for (int i = 1; i <= 10; i++) {
            UserProfile userProfile = new UserProfile();
            userProfile.setUserID(i);
            userProfile.setFirstName("User");
            userProfile.setLastName(String.valueOf(i));
            userProfile.setRole("Farmer");
            userProfile.setFarmLocation("Doveton");
            userProfile.setExperience(new Random().nextInt(1,30));
            userProfile.setLanguage(("English"));
            userProfiles.add(userProfile);
        }
    }

    public UserProfile createUserProfile(UserProfile userProfileRequest) {
        UserProfile userProfile = new UserProfile();
        userProfile.setUserID(userProfileRequest.getUserID());
        userProfile.setFirstName(userProfileRequest.getFirstName());
        userProfile.setLastName(userProfileRequest.getLastName());
        userProfile.setRole(userProfileRequest.getRole());
        userProfile.setExperience(userProfileRequest.getExperience());
        userProfile.setFarmLocation(userProfileRequest.getFarmLocation());
        userProfile.setLanguage(userProfileRequest.getLanguage());
        userProfiles.add(userProfile);
        return userProfile;
    }

    public UserProfile changeUserProfileRole(int userId, ChangeRoleRequest changeRoleRequest) {
        for (int i = 0; i < userProfiles.size(); i++) {
            UserProfile userProfile = userProfiles.get(i);
            if (userProfile.getUserID() == userId) {
                userProfile.setRole(changeRoleRequest.getRole());
                return userProfile;
            }
        }

        return null;
    }

    public UserProfile changeUserProfileLanguage(int userId, ChangeLanguageRequest changeLanguageRequest) {
        for (int i = 0; i < userProfiles.size(); i++) {
            UserProfile userProfile = userProfiles.get(i);
            if (userProfile.getUserID() == userId) {
                userProfile.setLanguage(changeLanguageRequest.getLanguage());
                return userProfile;
            }
        }

        return null;
    }


    public boolean removeUser(int userId) {
        boolean deleted = false;

        for (int i = 0; i < userProfiles.size(); i++) {
            if (userProfiles.get(i).getUserID() == userId) {
                userProfiles.remove(i);
                deleted = true;
            }
        }
        return deleted;
    }
}
