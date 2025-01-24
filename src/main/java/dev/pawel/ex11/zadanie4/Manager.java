package dev.pawel.ex11.zadanie4;

public class Manager extends Employee {
    private Employee[] teamMembers;
    private static int index = 0;

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
        teamMembers = new Employee[100];
    }

    @Override
    public double getSalary() {
        return this.getBaseSalary() + (index * 100);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " is managing a team of " + index + " people.");
    }

    public void hire(Employee employee) {
        if(index < teamMembers.length)
            teamMembers[index] = employee;
        index++;
    }

    public int getTeamSize() {
        return index;
    }

}
