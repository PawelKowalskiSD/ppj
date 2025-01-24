package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean start = true;

        while (start) {
            System.out.println("Write number and check if is even: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("Number: " + number + " is even");
                start = false;
            } else
                System.out.println("Number: " + number + " is odd");
        }
        scanner.close();
    }
}
