package com.ozagrimate.record_keeping_service;

public class FarmRecord {
    private int farmID;
    private String farmLocation;
    private float waterLevels;
    private String cropType;

    public int getFarmID() {
        return farmID;
    }
    
    public void setFarmID(int farmID) {
        this.farmID = farmID;
    }

    public String getFarmLocation() {
        return farmLocation;
    }
    public void setFarmLocation(String farmLocation) {
        this.farmLocation = farmLocation;
    }

    public float getWaterLevels() {
        return waterLevels;
    }
    public void setWaterLevels(float waterLevels) {
        this.waterLevels = waterLevels;
    }
    
    public String getCropType() {
        return cropType;
    }
    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    @Override 
    public String toString() {
        return "FarmRecord{" +
                "farmID=" + farmID +
                ", farmLocation=" + farmLocation +
                ", waterLevels=" + waterLevels +
                ", cropType=" + cropType +
                '}';
    }
}
