package com.LinkedList_in_JAVA.SinglyLinkedList.Sorting;

import com.LinkedList_in_JAVA.SinglyLinkedList.Deletion.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void sort(Node head){
        if(head == null) return;
        Node temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int num : list){
            temp.data = num;
            temp = temp.next;
        }
    }
}
