package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;

    private List <MeterReading> readings;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.readings = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<MeterReading> getReadings() {
        return readings;
    }

    public void setReadings(List<MeterReading> readings) {
        this.readings = readings;
    }
}
