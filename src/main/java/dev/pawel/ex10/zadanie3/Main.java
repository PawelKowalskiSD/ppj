package dev.pawel.ex10.zadanie3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford", "Focus");
        Car car3 = new Car("BMW", "X5", 2022);

        car1.drive();
        car2.drive(120);
        car3.drive("Warsaw");

        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
    }
}
