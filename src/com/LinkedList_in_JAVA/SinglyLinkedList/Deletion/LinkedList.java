package com.LinkedList_in_JAVA.SinglyLinkedList.Deletion;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {
    public Node head;

    public  Node deleteFromFront(){
        if(head == null || head.next == null) return null;
        Node temp = head;
        head = head.next;
        return temp;
    }

    public Node deleteFromLast(){
        if(head == null || head.next == null) return null;
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp;
    }

    public Node deleteFromMiddle(){
        if(head == null || head.next == null) return null;
        Node temp = head;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int mid = (cnt % 2 == 0) ? (cnt / 2) + 1 : cnt / 2;
        temp = head;
        Node prev = null;
        for(int i = 1; i < mid; i++){
            prev = temp;
            temp = temp.next;
        }
        if(prev != null) {
            prev.next = prev.next.next;
        }
        return temp;
    }

    public Node deleteFromGivenIndex(int index){
        if(head == null) return null;
        Node temp = head;
        if(index == 0){
            head = head.next;
            return temp;
        }
        Node prev = null;
        for(int i = 0; i < index; i++){
            if(temp == null){
                System.out.println("The given index is not present in the List.");
            }
            prev = temp;
            assert temp != null;
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("The given index is not present in the List.");
        }
        assert prev != null;
        prev.next = prev.next.next;
        return temp;
    }


    public void addInFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addInLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addInMiddle(int data){
        Node newNode = new Node(data);
        int cnt = 1;
        Node temp = head;
        if(head == null){
            head = newNode;
            return;
        }
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        int mid = cnt / 2;
        temp = head;
        Node prev = null;
        for(int i = 0; i < mid; i++){
            prev = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        if(prev != null){
            prev.next = newNode;
        }
        else head = newNode;
    }

    public void addInGivenIndex(int index, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }


    public Node deleteDuplicates(){
        Map<Integer, Integer> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            map.put(temp.data, map.getOrDefault(temp.data, 0) + 1);
            temp = temp.next;
        }
        Node ans = null;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans.data = key;
                ans = ans.next;
            }
        }
        return ans;
    }

    public void display(){
        System.out.println();
        Node temp = head;
        while(temp != null){
            System.out.printf(" %d -> ", temp.data);
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
