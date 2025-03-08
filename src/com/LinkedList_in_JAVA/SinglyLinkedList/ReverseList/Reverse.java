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

    //Part of reverseKGroup Function
    private static Node find(Node temp, int k){
        while(temp != null && k > 1){
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node temp = head;
        while(temp != null) {
            Node kthNode = find(temp, k);
            if (kthNode == null) break;

            Node next = kthNode.next;
            kthNode.next = null;
            Node newHead = reverseList(temp);
            prev.next = newHead;
            prev = temp;
            temp.next = next;
            temp = next;
        }
        return dummy.next;
    }
}
