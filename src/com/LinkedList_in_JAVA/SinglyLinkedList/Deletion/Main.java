package com.LinkedList_in_JAVA.SinglyLinkedList.Deletion;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addInFront(1);
        list.addInLast(1);
        list.addInLast(5);
        list.addInLast(5);
        list.addInLast(7);
        list.addInLast(8);
        list.addInFront(4);
        list.addInLast(4);
//        System.out.println("Before Deletion operation list is : ");
//        list.display();
//        Node deleted = list.deleteFromGivenIndex(3);
//        System.out.println();
//        System.out.printf("Deleted Node is : %d\n", deleted.data);
//        System.out.println();
//        System.out.println("After deletion operation list is : ");
//        list.display();
        Node ans = list.deleteDuplicates();
        System.out.println(ans);
    }
}
