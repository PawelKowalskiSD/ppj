package dev.pawel.ex10.zadanie1;

public class AreaCalculator {
    public static int calculateArea(int a){
        return a * a;
    };
    public static int calculateArea(int a, int b){
        return a * b;
    };
    public static double calculateArea(double kolo){
        return Math.PI * Math.pow(kolo, 2);
    };
}
