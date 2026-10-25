package com.ozagrimate.profile_management_service;


public class DeleteUserResponse {
    private int alertID;
    private String reason;
    private String message = "Alert has been deleted";
    
    public DeleteUserResponse(int alertID, String reason){
        this.alertID = alertID;
        this.reason = reason;
    }

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID( int alertID) {
        this.alertID = alertID;
    }

    public String getReason() {
        return reason;
    }

    public void setreason(String reason) {
        this.reason = reason;
    }

    public String getMessage() {
        return message;
    }

    public void getMessage(String message) {
        this.message = message;
    }

   @Override
    public String toString() {
        return "DeleteAlertResponse {" +
            "alertID=" + alertID +
            ", reason=" + reason +
            ", message=" + message +
            '}';
    }

}
