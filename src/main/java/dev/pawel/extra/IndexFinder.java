package dev.pawel.extra;

public class IndexFinder extends Consumer {
    private int findIndex;
    private Student trackedStudent;

    public IndexFinder(int findIndex) {
        this.findIndex = findIndex;
    }

    @Override
    public void accept(Student student) {
        if(student.s() == findIndex)
            trackedStudent = student;
    }

    public Student getTrackedStudent() {
        return trackedStudent;
    }
}
