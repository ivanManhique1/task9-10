package java.weatherApp;

import java.util.Date;

public class Report {
    private String title;
    private String bugDescription;
    private Date date;


    public Report(String title, String bugDescription, Date date) {
        this.title = title;
        this.bugDescription = bugDescription;
        this.date = date;
    }

    public void reportBug() {
        // Implementation for reporting a bug
    }
}