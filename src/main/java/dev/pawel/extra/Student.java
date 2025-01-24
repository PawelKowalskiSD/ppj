package dev.pawel.extra;

public record Student(String name, String surname, int s) implements Comparable<Student>{
    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + s;
    }

    @Override
    public int compareTo(Student otherStudent) {
        int compareSurname = this.surname.compareTo(otherStudent.surname);
        int compareName = this.name.compareTo(otherStudent.name);
        int compareS = Integer.compare(this.s, otherStudent.s);
        if(compareSurname != 0)
            return compareSurname;
        if(compareName != 0)
            return compareName;
        return compareS;
    }
}
