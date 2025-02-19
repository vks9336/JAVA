package com.LinkedList_in_JAVA.SinglyLinkedList.ReverseList;

import com.LinkedList_in_JAVA.SinglyLinkedList.Addition.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addInFront(12);
        list.addInFront(13);
        list.addInFront(14);
        list.addInFront(15);
        list.addInFront(16);
        list.addInFront(17);
        list.addInFront(18);
        list.addInFront(19);
        list.addInFront(20);
        list.head = Reverse.reverseList(list.head);
        list.display();
    }
}
