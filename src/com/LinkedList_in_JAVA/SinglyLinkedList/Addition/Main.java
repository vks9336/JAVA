package com.LinkedList_in_JAVA.SinglyLinkedList.Addition;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addInFront(12);
        ll.addInFront(13);
        ll.addInFront(14);
        ll.addInLast(15);
        ll.addInLast(16);
        ll.addInMiddle(17);
        ll.addInGivenIndex(3,18);
        ll.display();
    }
}
