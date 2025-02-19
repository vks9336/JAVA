package com.Collection_in_JAVA.List.LinkedList.CustomLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomDoublyLL list = new CustomDoublyLL();
        list.insertFirst(12);
        list.insertFirst(23);
        list.insertFirst(34);
        list.insertFirst(45);
        list.insertLast(12);
        list.insertLast(23);
        list.insertLast(34);
        list.insertLast(45);
        list.display();
    }
}
