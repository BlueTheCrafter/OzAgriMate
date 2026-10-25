package com.ozagrimate.farm_alerts_service;

public class FarmAlerts {
    private int alertID;
    private String alertType;
    private String alertSeverity;
    private String alertMessage;
    
    public String getAlertType() {
        return alertType;
    }
    
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getAlertSeverity() {
        return alertSeverity;
    }

    public void setAlertSeverity(String alertSeverity) {
        this.alertSeverity = alertSeverity;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public int getAlertID() {
        return alertID;
    }

    public void setAlertID(int alertID) {
        this.alertID = alertID;
    }

    @Override
    public String toString() {
        return "FarmAlerts {" +
            "alertID=" + alertID +
            ", alertType=" + alertType +
            ", alertSeverity=" + alertSeverity +
            ", alertMessage=" + alertMessage + 
            '}';
    }

}
