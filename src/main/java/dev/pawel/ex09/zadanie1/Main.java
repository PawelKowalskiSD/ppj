package dev.pawel.ex09.zadanie1;

public class Main {
    public static void main(String[] args) {
        Person romanSmith = new Person();
        Person tomasRooney = new Person();
        Person davidStanford = new Person();
        Person pabloYork = new Person();

        romanSmith.name = "Roman";
        romanSmith.surname = "Smith";
        romanSmith.age = 24;

        tomasRooney.name = "Tomas";
        tomasRooney.surname = "Rooney";
        tomasRooney.age = 36;

        davidStanford.name = "David";
        davidStanford.surname = "Stanford";
        davidStanford.age = 17;

        pabloYork.name = "Pablo";
        pabloYork.surname = "York";
        pabloYork.age = 34;

        System.out.println(romanSmith.name + " " + romanSmith.surname + " " + romanSmith.age);
        System.out.println(tomasRooney.name + " " + tomasRooney.surname + " " + tomasRooney.age);
        System.out.println(davidStanford.name + " " + davidStanford.surname + " " + davidStanford.age);
        System.out.println(pabloYork.name + " " + pabloYork.surname + " " + pabloYork.age);
    }
}
