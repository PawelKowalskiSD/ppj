package dev.pawel.ex03;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println('a' + 2); // a z tabeli ascii ktora ma wartość 97 i do niej dodajemy liczbę 2 następuje zamiana na typ zwracany int.
        System.out.println('a' + '2'); // dodajemy ascii ktora ma wartość 97 i wartość 2 z ascii ktora ma wartość 50 co daje nam wynik 147 w postaci int.
        System.out.println((char)('a' + 2)); //rzutujemy wynik dodawania 'a' + 2 na wynik podany jako char w tabeli ascii 97 - a + 2 = 99 = c
        System.out.println("ppj" + 'a' + '2'); // zaczynamy od ciągu zanków string co pozwala nam na doklejenie kolejnych znaków do wyniku i będziemy mieli ppja2
        System.out.println("ppj" + 'a' + '\t' + '2'); // zaczynamy od ciągu zanków string co pozwala nam na doklejenie kolejnych znaków do wyniku i będziemy mieli ppja znak specjalny tab i na koncu 2
        System.out.println('a' + '2' + "ppj"); // zaczynamy od dodania dwóch znaków char co daje nam wynik podany jako  147 i do tego doklejamy nasz string
    }
}
