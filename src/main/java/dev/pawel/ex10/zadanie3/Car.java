package dev.pawel.ex10.zadanie3;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this(brand, model, 2024);
    }

    public Car(String brand) {
        this(brand, "Unknown", 2024);
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", model: " + model + ", year: " + year);
    }

    public void drive() {
        System.out.println("Car drive ");
    }

    public void drive(int speed) {
        System.out.println("Car drive with " + speed);
    }

    public void drive(String destination) {
        System.out.println("Car drive to " + destination);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
