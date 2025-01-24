package dev.pawel.ex04;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setA = "A = (-15, -10)";
        String setB = "B = (-" + '\u221E' + ", -13)";
        boolean start = true;
        while (start) {
            System.out.println("************************");
            System.out.println("--> We have two set: ");
            System.out.println("******************");
            System.out.println("* " + setA + " *");
            System.out.println("* " + setB + "  *");
            System.out.println("******************");
            System.out.println("--> If you want exit program write EXIT and (y/n) <--");
            System.out.println("--> Write number: ");
            String wrt = scanner.nextLine();
            try {
                if (wrt.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Do you want to exit the program? (y/n)");
                    if (scanner.nextLine().trim().equalsIgnoreCase("y"))
                        start = false;
                } else {
                    int number = Integer.parseInt(wrt);

                    if ((number > -15 && number < -10) && (number < -13)) {
                        System.out.println("the number " + wrt + " belongs to both set.");

                    } else {
                        if (number > -15 && number < -10) {
                            System.out.println("the number " + wrt + " belongs to the set: ");
                            System.out.println(setA);
                        }

                        if (number < -13) {
                            System.out.println("the number " + wrt + " belongs to the set: ");
                            System.out.println(setB);
                        }
                        if (number >= -10)
                            System.out.println("number is out of range any set!");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or valid string ,,exit'' ");
            }
        }
        scanner.close();
    }
}
