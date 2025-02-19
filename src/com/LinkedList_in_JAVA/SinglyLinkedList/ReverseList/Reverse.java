package com.LinkedList_in_JAVA.SinglyLinkedList.ReverseList;
import com.LinkedList_in_JAVA.SinglyLinkedList.Addition.Node;

public class Reverse {
    public static Node reverseList(Node head){
        if(head == null || head.next == null) return head;
        Node list = reverseList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return list;
    }
}
