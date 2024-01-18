package java.weatherApp;

import java.util.Date;
import java.util.HashMap;

public class SearchHistory {
    private HashMap<Location, Date> listOfSearchLocations;

    public SearchHistory() {
    }

    public SearchHistory(HashMap<Location, Date> listOfSearchLocations) {
        this.listOfSearchLocations = listOfSearchLocations;
    }



    public Date addSearchHistory(Location location){
        return listOfSearchLocations.put(location, new Date());
    }
}