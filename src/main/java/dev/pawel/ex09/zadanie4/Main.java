package dev.pawel.ex09.zadanie4;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Fundamental", "Jan Tomaszewski", 2012);
        Book book2 = book1;
        System.out.println("\nfirst display of two objects when we assigned the first object to the second one");
        display(book1, book2);
        book2.setTitle("Java Core Gold Ages");
        book2.setAuthor("Damian James");
        book2.setYear(2020);
        System.out.println("\nsecond display after changing variables in the second object");
        display(book1, book2);
    }

    private static void display(Book book1, Book book2) {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("|   book1 ---> Title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Year: " + book1.getYear() + "    |");
        System.out.println("|   book2 ---> Title: " + book2.getTitle() + ", Author: " + book2.getAuthor() + ", Year: " + book1.getYear() + "    |");
        System.out.println("--------------------------------------------------------------------------------");
    }
}
