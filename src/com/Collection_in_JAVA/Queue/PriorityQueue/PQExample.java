package com.Collection_in_JAVA.Queue.PriorityQueue;

import java.util.PriorityQueue;

import java.util.Scanner;

public class PQExample {
    public static void main(String[] args) {
        // Way to make object of Priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<String> priorityQueue2 = new PriorityQueue<>();

        // one more method of add element to the queue by user input
        System.out.print("Enter the size of the Priority Queue : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter " + n + "elements of the Priority Queue : ");
        for (int i = 0; i <= n; i++) {
            priorityQueue2.add(sc.nextLine());
        }

        //printing the value of the Priority Queue
        System.out.println("Your Priority Queue is : ");
        for(String str : priorityQueue2){
            System.out.print(str + " ");
        }
        System.out.println();


        // add method for Priority Queue
        priorityQueue.add(12);
        priorityQueue.add(23);
        priorityQueue.add(123);
        priorityQueue.add(124);
        priorityQueue.add(126);

        // forEach method in Priority Queue
//        priorityQueue.forEach(System.out::println);

        // element method in Priority Queue
        System.out.println("Element : " + priorityQueue.element());

        //poll method in Priority Queue
        System.out.println("Poll : "  + priorityQueue.poll());

        //remove method in Priority Queue
        System.out.println("Removed element : " + priorityQueue.remove());
        System.out.println("Removed element : " + priorityQueue.remove());


    }
}
