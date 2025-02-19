package com.LinkedList_in_JAVA.SinglyLinkedList.Addition;

public class LinkedList {
    public Node head;

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
