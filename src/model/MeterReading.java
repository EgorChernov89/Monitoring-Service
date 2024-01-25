package model;

import java.util.HashMap;
import java.util.Map;

public class MeterReading {
    private int month;
    private int year;
    private Map<String,Double> meterValues;

    public MeterReading(int month, int year, Map<String, Double> meterValues) {
        this.month = month;
        this.year = year;
        this.meterValues = new HashMap<>();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Map<String, Double> getMeterValues() {
        return meterValues;
    }

    public void setMeterValues(Map<String, Double> meterValues) {
        this.meterValues = meterValues;
    }
}
