package dev.pawel.ex08;

public class Zadanie3 {
    public static void main(String[] args) {
        int wrt = 5;
        modifyValue(wrt);
    }

    public static void modifyValue(int wrt) {
        System.out.println("read input value: " + wrt);
        wrt *= 5;
        System.out.println("read input value after modify: " + wrt);
    }
}
