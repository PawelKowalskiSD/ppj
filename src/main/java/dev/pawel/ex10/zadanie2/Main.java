package dev.pawel.ex10.zadanie2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Pablo", 21);
        System.out.println(person.getFullName() + " " + person.getBirthYear());
    }
}
