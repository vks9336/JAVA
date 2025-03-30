package com.Queue_in_JAVA.Building_Queue_using_Array;

public class Queue {
    private final int[] queue;
    private int front = -1;
    private int rear = -1;
    private final int size;

    public Queue(int size){
        queue = new int[size];
        this.size = size;
    }

    public void enqueue(int data){
        if(rear == size - 1 && front != 0){
            rear = 0;
            queue[rear] = data;
            return;
        }
        if(rear == -1 && front == -1){
            rear++;
            front++;
            queue[rear] = data;
            return;
        }
        queue[++rear] = data;
    }

    public int dequeue(){
        if(front == -1 && rear == -1){
            System.out.println("Queue underflow!!");
            return front;
        }
        if(front == 0 && front == rear){
            int data = queue[front];
            front--;
            rear--;
            return data;
        }
        return queue[front++];
    }
}
