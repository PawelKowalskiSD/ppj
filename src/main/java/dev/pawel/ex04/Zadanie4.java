package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstSet = "1. (-" + '\u221E' + ", -10]";
        String secondSet = "2. (-15, 5)";
        String thirdSet = "3. [-5, 10]";
        String fourthSet = "4. (10, " + '\u221E' + ")";
        boolean start = true;
        while (start) {
            System.out.println("************************");
            System.out.println("--> We have fourth set: ");
            System.out.println("****************");
            System.out.println("* " + firstSet + " *");
            System.out.println("* " + secondSet + "  *");
            System.out.println("* " + thirdSet + "  *");
            System.out.println("* " + fourthSet + "   *");
            System.out.println("****************");
            System.out.println("--> If you want exit program write EXIT and (y/n) <--");
            System.out.println("--> Write number: ");
            String input = scanner.nextLine();
            try {
                if (input.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Do you want to exit the program? (y/n)");
                    if (scanner.nextLine().trim().equalsIgnoreCase("y"))
                        start = false;
                } else {
                    int number = Integer.parseInt(input);
                    System.out.println("the number " + input + " belongs to the set: ");
                    if (number <= -10)
                        System.out.println(firstSet);
                    if (number > -15 && number < 5)
                        System.out.println(secondSet);
                    if (number >= -5 && number <= 10)
                        System.out.println(thirdSet);
                    if (number > 10)
                        System.out.println(fourthSet);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or valid string ,,exit'' ");
            }
        }
        scanner.close();
    }
}
