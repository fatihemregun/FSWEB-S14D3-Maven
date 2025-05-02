package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.cylinders + " + " + this.name + " + " + this.wheels + " + " + this.engine;
    }

    @Override
    public boolean equals(Object car) {
        if (car == this) {
            return true;
        }

        if(!(car instanceof Car)) {
            return false;
        }

        Car car_test = (Car) car;

        boolean nameEquals = (this.name == null && car_test.name == null)
                || (this.name != null && this.name.equals(car_test.name));

        return nameEquals && this.cylinders == car_test.cylinders;
    }

    public String startEngine(){
        System.out.println( getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate(){
        System.out.println( getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake(){
        System.out.println( getClass().getSimpleName());
        return "the car is accelerating";
    }




}
