package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is program using if/else conditions\n");
        System.out.println("write first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("write second number:");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber)
            System.out.println("number: " + firstNumber + " is bigger");
        else if (firstNumber < secondNumber)
            System.out.println("number: " + secondNumber + " is bigger");
        else
            System.out.println("numbers are equals");

        System.out.println("This is program using operators\n");
        System.out.println("write first number:");
        int firstNumber2 = scanner.nextInt();
        System.out.println("write second number:");
        int secondNumber2 = scanner.nextInt();
        System.out.println(
                (firstNumber2 > secondNumber2)
                        ?
                        ("number: " + firstNumber2 + " is bigger")
                        :
                        ((firstNumber2 < secondNumber2)
                                ?
                                ("number: " + secondNumber2 + " is bigger")
                                :
                                ("numbers are equals"))
        );
        scanner.close();
    }
}