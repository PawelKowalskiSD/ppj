package dev.pawel.extra;

public class MaxFinder extends Consumer {
    private Student trackedStudent;

    @Override
    public void accept(Student student) {
        if (trackedStudent == null || student.s() > trackedStudent.s())
            trackedStudent = student;
    }

    public Student getTrackedStudent() {
        Student result = trackedStudent;
        trackedStudent = null;
        return result;
    }
}
