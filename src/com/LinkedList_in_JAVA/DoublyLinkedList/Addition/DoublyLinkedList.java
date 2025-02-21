package com.LinkedList_in_JAVA.DoublyLinkedList.Addition;

public class DoublyLinkedList {
    public Node head;

    public void addAtFront(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    public void addToLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        if(head.next == null){
            head.next = newNode;
            newNode.prev = head;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }


    public void addToTheMiddle(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        if(head.next == null){
            head.next = newNode;
            newNode.prev = head;
            return;
        }
        int cnt = 0;
        Node temp = head;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        cnt = (cnt % 2 == 0) ? (cnt / 2) : (cnt / 2) + 1;
        temp = head;
        Node previous = null;
        for(int i  = 0; i < cnt; i++){
            previous = temp;
            temp = temp.next;
        }
        assert previous != null;
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = temp;
        temp.prev = newNode;

    }


    public void display(){
        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.printf("%d <-> ", temp.data);
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println();
    }
}
