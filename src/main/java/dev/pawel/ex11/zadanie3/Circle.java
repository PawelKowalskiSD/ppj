package dev.pawel.ex11.zadanie3;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * 2 * radius;
    }
}
