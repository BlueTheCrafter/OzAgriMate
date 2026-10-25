package com.ozagrimate.farm_updates_service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/farm-updates")
public class FarmUpdateAPI {
    FarmDataAccess farmDataAccess;
    
    public FarmUpdateAPI() {
        farmDataAccess = new FarmDataAccess();
    }

    @GetMapping("/updates/{date}") 
    public ResponseEntity <FarmUpdate> getFarmUpdate(@PathVariable String date){ 
        FarmUpdate farmUpdate = farmDataAccess.getFarmUpdate(date);
        if (farmUpdate != null) {
            return ResponseEntity.ok(farmUpdate);
        }
        else 
            return ResponseEntity.notFound().build();
    }

}
