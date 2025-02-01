package dev.pawel.extra;

public class SortedDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    private boolean isNotReverseAlphabet;

    private SortedDoublyLinkedList(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }

    public SortedDoublyLinkedList() {
        this(null, null, 0);
    }

    public Node get(int index) {
        checkIndex(index);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public void add(Student student) {
        Node node = new Node(student);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            if (isNotReverseAlphabet) {
                if (student.compareTo(head.getStudent()) >= 0) {
                    node.setNext(head);
                    head.setPrevious(node);
                    head = node;
                } else if (student.compareTo(tail.getStudent()) < 0) {
                    node.setPrevious(tail);
                    tail.setNext(node);
                    tail = node;
                } else {
                    Node temp = head;
                    while (temp.getNext() != null) {
                        if (temp.getStudent().compareTo(student) < 0) {
                            break;
                        }
                        temp = temp.getNext();
                    }
                    node.setNext(temp);
                    node.setPrevious(temp.getPrevious());
                    if (temp.getPrevious() != null) {
                        temp.getPrevious().setNext(node);
                    }
                    temp.setPrevious(node);
                }
            } else {
                if (student.compareTo(head.getStudent()) <= 0) {
                    node.setNext(head);
                    head.setPrevious(node);
                    head = node;
                } else if (student.compareTo(tail.getStudent()) > 0) {
                    node.setPrevious(tail);
                    tail.setNext(node);
                    tail = node;
                } else {
                    Node temp = head;
                    while (temp.getNext() != null) {
                        if (temp.getStudent().compareTo(student) > 0) {
                            break;
                        }
                        temp = temp.getNext();
                    }
                    node.setNext(temp);
                    node.setPrevious(temp.getPrevious());
                    if (temp.getPrevious() != null) {
                        temp.getPrevious().setNext(node);
                    }
                    temp.setPrevious(node);
                }
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void removeFirst() {
        checkIfListIsEmpty();
        if (head.equals(tail)) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrevious(null);
        }
        size--;
    }

    public void removeLast() {
        checkIfListIsEmpty();
        if (head.equals(tail)) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        size--;
    }

    public void removeAt(int index) {
        checkIfListIsEmpty();
        checkIndex(index);
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        size--;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for list of size " + size);
        }
    }

    public void supplyTo(Consumer consumer) {
        Node temp = head;
        while (temp != null) {
            consumer.accept(temp.getStudent());
            temp = temp.getNext();
        }
    }

    public void reverse() {
        if (head == null)
            return;
        tail = head;
        head = reverseImp(head);
        isNotReverseAlphabet = !isNotReverseAlphabet;
    }

    private Node reverseImp(Node node) {
        if (node.getNext() == null) {
            return node;
        }
        Node newHead = reverseImp(node.getNext());
        Node nextNode = node.getNext();
        nextNode.setNext(node);
        node.setPrevious(nextNode);
        node.setNext(null);
        return newHead;
    }

    private void checkIfListIsEmpty() {
        if (head == null || tail == null)
            throw new RemovalFromEmptyListException("you can't remove an item from an empty list");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (head == null) {
            return stringBuilder.append("[]").toString();
        }
        Node temp = head;
        stringBuilder.append(temp);
        while (temp.getNext() != null) {
            temp = temp.getNext();
            stringBuilder.append("\n").append(temp.toString());
        }
        return stringBuilder.toString();
    }
}
