package com.Collection_in_JAVA.List.LinkedList.CustomLinkedList;

public class CustomSinglyLL {
    private Node head;
    private Node tail;
    private int size;
    public CustomSinglyLL() {
        this.size = 0;
    }

    public Node find(int value){
        Node node = head;
        while(node.value != value){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }

    public void delete(int index){
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size){
            deleteLast();
            return;
        }
        Node node = head;
        for (int i = 1; i <= index - 1; i++) {
            node = node.next;
        }
        Node temp = node.next;
        node.next = temp.next;
        size -= 1;
    }

    public int Size() {
        return size;
    }

    public void set(int index, int value){
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    public void get(int index){
        if(size <= 1){
            System.out.println(head.value);
            return;
        }
        Node node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        System.out.println(node.value);
    }

    public void deleteLast(){
        if(tail == null){
            deleteFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size -= 1;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(size == 1){
            head = null;
            size -= 1;
            return;
        }
        head = head.next;
        size -= 1;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node node = new Node(value,temp.next);
            temp.next = node;
            size += 1;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
        }
        else{
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" + value + "]";
        }
    }

}
