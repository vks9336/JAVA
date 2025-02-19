package com.LinkedList_in_JAVA.SinglyLinkedList.Searching;

import com.LinkedList_in_JAVA.SinglyLinkedList.Addition.Node;
import com.LinkedList_in_JAVA.SinglyLinkedList.Addition.LinkedList.*;

public class Searching {
    public static int search(Node head, int data){
        if(head == null) return -1;
        if(head.data == data) return 0;
        Node temp = head;
        int cnt = -1;
        while(true){
            if(temp.data == data){
                cnt++;
                break;
            }
            else if(temp.next == null){
                cnt = -1;
                break;
            }
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}
