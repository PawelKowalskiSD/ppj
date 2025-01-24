package dev.pawel.test;

public class App {
    public static void main(String[] args) {
        Lift lift = new Lift(10);
        System.out.println(lift);  //winda na 0
        lift.go(2);   // go up 0 1 2
        System.out.println(lift); //winda na 2
        lift.go(5); //go up 2 3 4 5
        System.out.println(lift); //winda na 5
        lift.go(1); // go down 5 4 3 2 1
        System.out.println(lift); //winda na 1
        lift.go(1); // jest na floor
        try {
            lift.go(11);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Lift.cos();
        new Lift(10).cos();
    }
}
