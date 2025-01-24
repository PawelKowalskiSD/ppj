package dev.pawel.ex08;

public class Zadanie9 {
    public static int silnia(int n) {
        if (n == 1) return 1;
        return n * silnia(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(silnia(5));
    }
}
