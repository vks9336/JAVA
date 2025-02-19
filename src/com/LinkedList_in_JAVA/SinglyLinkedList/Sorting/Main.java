package com.LinkedList_in_JAVA.SinglyLinkedList.Sorting;

import com.LinkedList_in_JAVA.SinglyLinkedList.Deletion.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addInFront(1);
        list.addInFront(67);
        list.addInFront(4);
        list.addInFront(5);
        list.addInFront(89);
        list.addInFront(49);
        list.addInFront(44);
        list.addInFront(15);
        list.addInFront(65);
        list.addInFront(25);
        System.out.println("Before sorting the list is : ");
        list.display();
        System.out.println("After sorting the list is : ");
        Sorting.sort(list.head);
        list.display();
    }
}
