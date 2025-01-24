package dev.pawel.ex11.zadanie4;

public class App {
    public static void main(String[] args) {
        System.out.println("=============EMPLOYEE==============");
        Employee employee1 = new Employee("Roy", 600);
        employee1.work();
        Employee employee2 = new Employee("David", 500);
        System.out.println(employee1.getSalary());
        employee2.work();
        System.out.println(employee2.getSalary());
        Employee employee3 = new Employee("John", 700);
        employee3.work();
        System.out.println(employee3.getSalary());
        Employee employee4 = new Employee("Ralf", 400);
        employee4.work();
        System.out.println(employee4.getSalary());
        System.out.println();
        System.out.println("==================MANAGER====================");
        Manager manager = new Manager("Roman", 1200);
        manager.hire(employee1);
        manager.hire(employee2);
        manager.hire(employee3);
        manager.hire(employee4);
        manager.work();
        System.out.println("manager salary: " + manager.getSalary());
        System.out.println(manager.getTeamSize());
        System.out.println(manager.getSalary());
        System.out.println();
        System.out.println("==================Executive====================");
        Executive executive = new Executive("Damian", 1000, 1.5);
        executive.work();
        System.out.println("Executive salary: " + executive.getSalary());
        executive.setStockOptions(2.5);
        executive.work();
        System.out.println(executive.getSalary());
    }
}
