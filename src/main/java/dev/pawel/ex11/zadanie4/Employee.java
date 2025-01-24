package dev.pawel.ex11.zadanie4;

public class Employee {
    private final String name;
    private final double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
