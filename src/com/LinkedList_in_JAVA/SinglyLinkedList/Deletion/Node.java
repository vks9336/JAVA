package com.LinkedList_in_JAVA.SinglyLinkedList.Deletion;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return STR."\{data} -> \{next}";
    }
}
