package dev.pawel.ex05;

import java.util.Scanner;

public class Zadanie2 {
    private final static Scanner SCANNER = new Scanner(System.in);
    private final static String WRITE_FIRST_NUMBER = "wprowadz pierwsza liczbę";
    private final static String WRITE_SECOND_NUMBER = "wprowadz drugą liczbę";

    public static void main(String[] args) {
        String input = SCANNER.nextLine();
        int firstNumber;
        int secondNumber;
        int score = 0;

        int result = switch (input.trim().toLowerCase()) {

            case ("dodawanie") -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = firstNumber + secondNumber;
                yield score;
            }
            case "odejmowanie" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = firstNumber - secondNumber;
                yield score;
            }
            case "mnożenie" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = firstNumber * secondNumber;
                yield score;
            }
            case "dzielenie" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = firstNumber / secondNumber;
                yield score;
            }
            case "reszta z dzielenia" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = firstNumber % secondNumber;
                yield score;
            }
            case "potęgowanie" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                System.out.println(WRITE_SECOND_NUMBER);
                secondNumber = SCANNER.nextInt();
                score = (int) Math.pow(firstNumber, secondNumber);
                yield score;
            }
            case "pierwiastkowanie" -> {
                System.out.println(WRITE_FIRST_NUMBER);
                firstNumber = SCANNER.nextInt();
                score = (int)Math.sqrt(firstNumber);
                yield score;
            }
            default -> {
                System.out.println("cos zle");
                yield score;
            }
        };
        System.out.println("Wynik dodawania to: " + result);
    }
}
