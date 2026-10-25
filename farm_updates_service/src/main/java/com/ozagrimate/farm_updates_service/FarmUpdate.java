package com.ozagrimate.farm_updates_service;

public class FarmUpdate {
    private String date;
    private float waterLevel;
    private int numFarmers;
    private String cropStatus;
    private float fertilizerLevel;

    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }

    public float getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(float waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getNumFarmers() {
        return numFarmers;
    }

    public void setNumFarmers(int numFarmers) {
        this.numFarmers = numFarmers;
    }

    public String getCropStatus() {
        return cropStatus;
    }

    public void setCropStatus(String cropStatus) {
        this.cropStatus = cropStatus;
    }

    public float getFertilizerLevel() {
        return fertilizerLevel;
    }

    public void setFertilizerLevel(float fertilizerLevel) {
        this.fertilizerLevel = fertilizerLevel;
    }

    @Override 
    public String toString() {
        return "FarmUpdate {" +
            "date='" + date  +
            ", waterLevel=" + waterLevel + "%" +
            ", numFarmers=" + numFarmers +
            ", cropStatus='" + cropStatus +
            ", fertilizerLevel=" + fertilizerLevel + "%" +
            '}';
    }
}
