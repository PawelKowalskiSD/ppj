package dev.pawel.ex06;

public class Zadanie6 {
    static String FLAG_INTEGER = "-i";
    static String FLAG_DOUBLE = "-d";

    public static void main(String[] args) {
        boolean flagInteger = args[0].equals(FLAG_INTEGER);
        boolean flagDouble = args[0].equals(FLAG_DOUBLE);
        if (flagInteger) {
            int firsValue = Integer.parseInt(args[1]);
            int secondValue = Integer.parseInt(args[2]);
            int diff = Integer.parseInt(args[3]);
            if (diff < 0) {
                System.out.print("different between must be bigger than zero");
                return;
            }
            while (firsValue <= secondValue) {
                System.out.print(firsValue + ", ");
                firsValue += diff;
            }
        } else if (flagDouble) {
            double firsValue = Double.parseDouble(args[1]);
            double secondValue = Double.parseDouble(args[2]);
            double diff = Double.parseDouble(args[3]);
            if (diff < 0) {
                System.out.print("different between must be bigger than zero");
                return;
            }
            while (firsValue <= secondValue) {
                if (firsValue < secondValue)
                    System.out.print(firsValue + ", ");
                else
                    System.out.print(firsValue);
                firsValue += diff;
            }
        } else
            System.out.println("Wrong flag");
    }
}
