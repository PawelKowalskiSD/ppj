import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random randomowaLiczba = new Random();
        int start = 0;
        int licznik1 = 0;
        int licznik2 = 0;
        System.out.println("write number: ");
        int dlugosc = sc.nextInt();
        boolean[] arr = new boolean[dlugosc];
        while (start < dlugosc) {
            arr[start] = randomowaLiczba.nextBoolean();
            if (arr[start])
                licznik1++;
            else
                licznik2++;
            start++;
        }
        boolean[] tylkoTrue = new boolean[licznik1];
        boolean[] tylkoFalse = new boolean[licznik2];
        start = 0;
        licznik1 = 0;
        licznik2 = 0;
        while (start < dlugosc) {
            if (arr[start]) {
                tylkoTrue[licznik1] = arr[start];
                licznik1++;
            } else {
                tylkoFalse[licznik2] = arr[start];
                licznik2++;
            }
            start++;
        }
        System.out.println("pierwsza tablica: " + dlugosc + " " + Arrays.toString(arr));
        System.out.println("drugra tablica z true: " + licznik1 + " " + Arrays.toString(tylkoTrue));
        System.out.println("trzecia tablica z false: " + licznik2 + " " + Arrays.toString(tylkoFalse));
    }
}
