package com.ozagrimate.farm_alerts_service;

public class DeleteAlertResponse {
    private int alertID;
    private boolean resolved;
    private String message = "Alert has been deleted";
    
    public DeleteAlertResponse(int alertID, boolean resolved){
        this.alertID = alertID;
        this.resolved = resolved;
    }

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID( int alertID) {
        this.alertID = alertID;
    }

    public boolean getResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
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
            ", resolved=" + resolved +
            ", message=" + message +
            '}';
    }

}
