package com.LinkedList_in_JAVA.SinglyLinkedList.Searching;

import com.LinkedList_in_JAVA.SinglyLinkedList.Addition.LinkedList;
//import com.LinkedList_in_JAVA.SinglyLinkedList.Deletion.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addInFront(12);
        list.addInLast(13);
        list.addInLast(56);
        list.addInLast(45);
        list.addInLast(67);
        list.addInLast(18);
        list.addInGivenIndex(4,100);
        list.display();
        int index = Searching.search(list.head, 20);
        if(index == -1){
            System.out.println("Element is not found in the list.");
        }
        else System.out.printf("Element found at %d index in the list.", index);
    }
}
