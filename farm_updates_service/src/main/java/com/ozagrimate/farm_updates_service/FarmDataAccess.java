package com.ozagrimate.farm_updates_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FarmDataAccess {
    public FarmDataAccess() {
        createDummyFarmData();
    }

    private List <FarmUpdate> farmUpdates = new ArrayList<>();
   
    public final void createDummyFarmData() {
        if (farmUpdates.isEmpty()){
            for (int i = 1; i <= 5; i++) {
                FarmUpdate farmUpdate = new FarmUpdate();
                farmUpdate.setDate(String.valueOf(i) + "-1-2026");
                farmUpdate.setWaterLevel(new Random().nextFloat(0,1));
                farmUpdate.setNumFarmers(new Random().nextInt(1, 20));
                switch(new Random().nextInt(0, 3)) {
                    case 0:
                        farmUpdate.setCropStatus("Planted");
                        break;
                    case 1:
                        farmUpdate.setCropStatus("Sprouting");
                        break;
                    case 2:
                        farmUpdate.setCropStatus("Growing");
                        break;
                    case 3:
                        farmUpdate.setCropStatus("Harvesting");
                        break; 
                }
                farmUpdate.setFertilizerLevel(new Random().nextFloat(0,1));

                farmUpdates.add(farmUpdate);
                System.err.println(farmUpdate.toString());
            }
        }
        
  
    }

    public FarmUpdate getFarmUpdate(String date) {
        for (int i = 0; i < farmUpdates.size(); i++ ) {
            if (farmUpdates.get(i).getDate().equals(date)) {
                return farmUpdates.get(i);
            }
        }
        return null;
    }

}
