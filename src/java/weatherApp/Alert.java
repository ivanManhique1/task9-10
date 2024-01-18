package java.weatherApp;

public class Alert {
    private String name;
    private String description;

    public Alert(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String sendNotification() {
        // Method implementation
        return "name: "+ name + " description: "+ description;
    }
}
