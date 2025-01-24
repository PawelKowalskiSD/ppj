package dev.pawel.ex07;

public class User {
    private final String name;
    private final String surname;
    private final int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int milticos(int a, int b) {
        return a + b;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

}
