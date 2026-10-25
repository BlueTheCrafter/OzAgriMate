package com.ozagrimate.profile_management_service;

public class UserProfile {
    private int userID;
    private String firstName;
    private String lastName;
    private String role;
    private int experience;
    private String farmLocation;
    private String language;

    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setFarmLocation(String farmLocation) {
        this.farmLocation = farmLocation;
    }

    public String getFarmLocation() {
        return farmLocation;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override 
    public String toString() {
        return "UserProfile{" +
                "userID=" + userID +
                ", firstName=" + firstName  +
                ", lastName=" + lastName +
                ", role=" + role +
                ", farmLocation=" + farmLocation +
                ", experience=" + experience +
                ", language=" + language +
                '}';
    }
}
