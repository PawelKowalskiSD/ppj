package dev.pawel.ex11.zadanie3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4, 5);
        Shape []array = {circle, rectangle};
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i].area());
    }
}
