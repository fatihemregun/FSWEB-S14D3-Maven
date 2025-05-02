package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(double avgKmPerLiter, int cylinders, int batterySize) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter(){
        return avgKmPerLiter;
    }

    public int getCylinders(){
        return cylinders;
    }

    public int getBatterySize(){
        return batterySize;
    }


}
