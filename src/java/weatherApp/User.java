package java.weatherApp;

import java.util.List;

public class User {
    private String name;
    private String spotifyAccount; // Optional, hence could be null
    
    // Association with other classes
    private Location location;
    private Preferences preferences;
    private List<Report> reports;
    private SearchHistory searchHistory;

    public User(String name, Preferences preferences, List<Report> reports, SearchHistory searchHistory) {
        this.name = name;
        this.preferences = preferences;
        this.reports = reports;
        this.searchHistory = searchHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpotifyAccount() {
        return spotifyAccount;
    }

    public void setSpotifyAccount(String spotifyAccount) {
        this.spotifyAccount = spotifyAccount;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public SearchHistory getSearchHistory() {
        return searchHistory;
    }

    public void setSearchHistory(SearchHistory searchHistory) {
        this.searchHistory = searchHistory;
    }
}
