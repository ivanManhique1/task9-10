package java.weatherApp;

import java.util.Date;

public class WeatherRecord {
    private Location location;
    private Weather weather;
    private Date date; // This assumes you are using java.util.Date to represent the date.

    public WeatherRecord(Location location, Weather weather, Date date) {
        this.location = location;
        this.weather = weather;
        this.date = date;
    }

    // Accessor methods for each field
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Other methods related to the WeatherRecord
}
