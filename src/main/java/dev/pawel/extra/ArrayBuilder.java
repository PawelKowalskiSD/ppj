package dev.pawel.extra;

public class ArrayBuilder extends Consumer {
    private Student[] students = new Student[10];
    private int index = 0;

    @Override
    public void accept(Student student) {
        if (students.length > index)
            students[index++] = student;
        else {
            Student[] temp = new Student[students.length * 2];
            for (int i = 0; i < students.length; i++) {
                temp[i] = students[i];
            }
            temp[index++] = student;
            students = temp;
        }
    }

    public Student[] getStudents() {
        reSize();
        index = 0;
        return students;
    }

    private void reSize() {
        Student[] temp = new Student[index];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = students[i];
        }
        students = temp;
    }
}
