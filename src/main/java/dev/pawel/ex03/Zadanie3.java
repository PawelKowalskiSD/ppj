package dev.pawel.ex03;

public class Zadanie3 {
    public static void main(String[] args) {
        byte valByte = 20;
        char valChar = 'A';
        int valInt = 100;
        float valFloat = 10.0F;
        double valDouble = 500.0;

        //char resultChar = valChar + valInt; -> nie można przypisać do chara liczby;
        int resultInt = valInt + valChar;
        //float resultFloat = valFloat + valDouble; -> utrata wartości przy dużym double . do float można zapisac mniejszą wartość
        //byte resultByte = valByte + valInt;   -> utrata wartości przy dodaniu dużego Inta który wychodzi po za zakres byte
    }
}
