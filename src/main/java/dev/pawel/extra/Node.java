package dev.pawel.extra;

import java.util.Objects;

public class Node {
    private Student student;
    private Node next;
    private Node previous;

    private Node(Student student, Node next, Node previous) {
        this.student = student;
        this.next = next;
        this.previous = previous;
    }

    public Node(Student student) {
        this(student, null, null);
    }

    public Student getStudent() {
        return student;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;
        return Objects.equals(student, node.student) && Objects.equals(next, node.next) && Objects.equals(previous, node.previous);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(student);
        result = 31 * result + Objects.hashCode(next);
        result = 31 * result + Objects.hashCode(previous);
        return result;
    }

    @Override
    public String toString() {
        return student.toString();
    }
}
