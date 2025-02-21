package com.LinkedList_in_JAVA.DoublyLinkedList.Addition;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addAtFront(12);
        dll.addAtFront(34);
        dll.addAtFront(45);
        dll.addAtFront(2);
        dll.addAtFront(7);
        dll.addAtFront(8);
        dll.addAtFront(6);
        dll.display();
        dll.addToLast(1);
        dll.display();
        dll.addToTheMiddle(56);
        dll.display();
        dll.addToTheMiddle(7);
        dll.display();
    }
}
