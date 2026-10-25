package com.ozagrimate.record_keeping_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/farm-records")
public class RecordKeepingAPI {
    ManageStock manageStock;

    public RecordKeepingAPI() {
        manageStock = new ManageStock();
    }

    @PostMapping("/records/{farmID}")
    public ResponseEntity <FarmRecord> addFarmRecord(@PathVariable int farmID, @RequestBody FarmRecord farmRecordRequest) {
        FarmRecord farmRecordNew = manageStock.addFarmRecord(farmID, farmRecordRequest);
        return ResponseEntity.ok(farmRecordNew);
    }
}
