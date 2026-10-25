package com.ozagrimate.farm_alerts_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController 
@RequestMapping ("/alerts")
public class FarmAlertsAPI {
    FarmAlertsServiceLayer farmAlertsServiceLayer;

    public FarmAlertsAPI() {
        farmAlertsServiceLayer = new FarmAlertsServiceLayer();
    }

    @GetMapping ("/show")
    public ResponseEntity <List<FarmAlerts>> getAllFarmAlerts(){
        List<FarmAlerts> farmAlerts = farmAlertsServiceLayer.showAllAlerts();
        
        return ResponseEntity.ok(farmAlerts);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<DeleteAlertResponse> deleteFarmAlert(@PathVariable int id) {
        boolean deleted = farmAlertsServiceLayer.removeAlert(id);
        if (deleted == true) {
            DeleteAlertResponse deleteAlertResponse = new DeleteAlertResponse(id, true);
            deleteAlertResponse.toString();

            return ResponseEntity.ok(deleteAlertResponse);
        }
        return ResponseEntity.notFound().build();
    }
}
