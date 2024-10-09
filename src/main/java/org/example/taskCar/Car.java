package org.example.taskCar;

public class Car implements Drivable {
    private String name;
    private String model;
    private int theYearOfManufacture;

    @Override
    public void drive() {
        System.out.println("Car driving");
    }
    @Override
    public void start(){
        System.out.println("Car starting");
    }
    @Override
    public void stop(){
        System.out.println("Car stopping");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTheYearOfManufacture() {
        return theYearOfManufacture;
    }

    public void setTheYearOfManufacture(int theYearOfManufacture) {
        this.theYearOfManufacture = theYearOfManufacture;
    }
}
