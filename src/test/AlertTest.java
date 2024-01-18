package test;

import org.junit.jupiter.api.Test;
import java.weatherApp.Alert;

import static org.junit.jupiter.api.Assertions.*;

class AlertTest {

    @Test
    void sendNotification() {
        Alert alert = new Alert("Bad Weather", "Stay Inside");

        assertEquals("name: "+ "Bad Weather" + " description: "+ "Stay Inside", alert.sendNotification());
    }
}