package com.ozagrimate.record_keeping_service;

import java.util.ArrayList;
import java.util.List;

public class ManageStock {
    private List <FarmRecord> farmRecords = new ArrayList<>();

    public FarmRecord addFarmRecord(int farmID, FarmRecord farmRecordRequest) {
        FarmRecord farmRecord = new FarmRecord();
        farmRecord.setFarmID(farmRecordRequest.getFarmID());
        farmRecord.setFarmLocation(farmRecordRequest.getFarmLocation());
        farmRecord.setWaterLevels(farmRecordRequest.getWaterLevels());
        farmRecord.setCropType(farmRecordRequest.getCropType());
        farmRecords.add(farmRecord);
        return farmRecord;
    }   
}
