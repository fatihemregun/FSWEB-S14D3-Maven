package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
        System.out.println("CarSkeleton is working");
    }

    public CarSkeleton(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void startEngine(){
        System.out.println("the car's engine is starting");
    }

    protected void runEngine() {
        System.out.println("The engine is running.");
    };

    public void drive(){
        System.out.println("The car is ready for driving.");
        runEngine();
    };

    @Override
    public String toString(){
        return this.name + " + " + this.description;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof CarSkeleton)) {
            return false;
        }

        CarSkeleton obj_cast = (CarSkeleton) obj;

        boolean nameEquals = (this.name == null && obj_cast.name == null)
                || (this.name != null && this.name.equals(obj_cast.name));

        boolean descriptionEquals = (this.description == null && obj_cast.description == null)
                || (this.description != null && this.description.equals(obj_cast.description));

        return nameEquals && descriptionEquals;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

}
