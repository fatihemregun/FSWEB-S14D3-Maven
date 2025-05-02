package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(double avgKmPerLiter, int cylinders){
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter(){
        return avgKmPerLiter;
    }

    public int getCylinders(){
        return cylinders;
    }
}
