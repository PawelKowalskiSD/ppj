package dev.pawel.ex08;

public class Zadanie11 {
    public static int sumNumber(int n) {
        if (n < 10) return n;
        return sumNumber(n / 10) + sumNumber(n % 10);
    }

    public static void main(String[] args) {
        System.out.println(sumNumber(123));
    }
}
