package com.Collection_in_JAVA.List.LinkedList.CustomLinkedList;

public class CustomDoublyLL {
    private Node head;
    private Node tail;
    private static int size = 0;
    public CustomDoublyLL() {
    }

    public void insertFirst(int value){
        Node node = new Node();
        node.value = value;
        node.prev = null;
        if(head == null){
            head = node;
            head.prev = null;
            head.next = null;
            tail = node;
            tail.next = null;
            tail.prev = null;
            size += 1;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size += 1; 
    }

    public void insertLast(int value){
        Node node = new Node();
        node.value = value;
        Node temp = head;
        if(head == null){
            insertFirst(value);
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size += 1;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END");
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node() {
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
