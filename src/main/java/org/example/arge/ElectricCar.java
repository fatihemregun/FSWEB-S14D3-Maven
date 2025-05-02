package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;

    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter(){
        return avgKmPerLiter;
    }

    public int getBatterySize(){
        return batterySize;
    }




}
