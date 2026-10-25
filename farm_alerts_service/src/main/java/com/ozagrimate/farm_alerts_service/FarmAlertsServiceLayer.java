package com.ozagrimate.farm_alerts_service;

import java.util.ArrayList;
import java.util.List;

public class FarmAlertsServiceLayer {
    private List<FarmAlerts> farmAlerts = new ArrayList<>();
    public FarmAlertsServiceLayer() {
        createDummyAlert();
    }

    public final void createDummyAlert() {
        FarmAlerts farmAlert = new FarmAlerts();
        farmAlert.setAlertType("Mechanical");
        farmAlert.setAlertSeverity("Critical");
        farmAlert.setAlertMessage("The main irrigation is down.");
        farmAlert.setAlertID(1);
        farmAlerts.add(farmAlert);

        FarmAlerts farmAlert2 = new FarmAlerts();
        farmAlert2.setAlertType("Agricultural");
        farmAlert2.setAlertSeverity("Slight risk");
        farmAlert2.setAlertMessage("The wheat is overdue to be watered by 1 day.");
        farmAlert2.setAlertID(2);
        farmAlerts.add(farmAlert2);


    }

    public List<FarmAlerts> showAllAlerts(){
        return farmAlerts;
    }
    
    public boolean removeAlert(int alertID) {
        boolean deleted = false;

        for (int i = 0; i < farmAlerts.size(); i++) {
            if (farmAlerts.get(i).getAlertID() == alertID) {
                farmAlerts.remove(i);
                deleted = true;
            }
        }
        return deleted;
    }
    


}
