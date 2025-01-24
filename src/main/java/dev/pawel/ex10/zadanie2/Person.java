package dev.pawel.ex10.zadanie2;

public class Person {
    private String fullName;
    private int birthYear;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this(fullName);
        this.birthYear = 2024 - age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }
}
