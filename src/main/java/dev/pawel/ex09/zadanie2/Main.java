package dev.pawel.ex09.zadanie2;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 2000.0, 10);
        Product monitor = new Product("Monitor", 479.0, 5);
        Product keyboard = new Product("Keyboard", 200.0, 12);

        System.out.println("Product: " + laptop.productName() + ", Cena: " + laptop.price() + ", Ilość: " + laptop.stock());
        System.out.println("Product: " + monitor.productName() + ", Cena: " + monitor.price() + ", Ilość: " + monitor.stock());
        System.out.println("Product: " + keyboard.productName() + ", Cena: " + keyboard.price() + ", Ilość: " + keyboard.stock());
    }
}
