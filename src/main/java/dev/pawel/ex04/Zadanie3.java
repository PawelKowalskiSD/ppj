package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number: ");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.println("Your number is " + number + " and is greater than 0");
        else if (number < 0)
            System.out.println("Your number is " + number + " and is less than 0");
        else
            System.out.println("Your number is " + number + " and is equals 0");
        scanner.close();
    }
}
