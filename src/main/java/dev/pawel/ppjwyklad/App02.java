package dev.pawel.ppjwyklad;

import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (reversedNumber > Integer.MAX_VALUE / 10
                    || (reversedNumber == Integer.MAX_VALUE / 10
                    && digit > Integer.MAX_VALUE % 10)) {
                System.out.println("The reversed number is to big");
                return;
            }
            reversedNumber = reversedNumber * 10 + digit;
        }
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
