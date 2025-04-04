package com.Arrays_in_JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OperationsOnArray {
    //printArray method
    public static void printArray(List<Integer> list){
        for(int num : list){
            System.out.printf("%d ", num);
        }
        System.out.println();
    }


    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while(true){
            System.out.println("Below are the operations that you can do to the array : ");
            System.out.println("1 -> Insert\n2 -> Delete\n3 -> Search\n4 -> Exit.");
            System.out.print("Enter the operation that you want to perform : ");
            int operation = sc.nextInt();
            switch(operation){
                case 1: //insert
                    System.out.print("Enter the value that you want to insert : ");
                    int X = sc.nextInt();
                    list.add(X);
                    Collections.sort(list);
                    break;

                case 2: //delete
                    if(list.isEmpty()){
                        System.out.println("Nothing to remove from the list!!");
                        break;
                    }
                    else {
                        int removed = list.removeFirst();
                        System.out.printf("Removed value is : %d\n", removed);
                    }
                    break;

                case 3: //search
                    System.out.print("Enter the target that you want to search : ");
                    int target = sc.nextInt();
                    int index = -1;
                    index = Collections.binarySearch(list, target);
                    if(index <= -1) System.out.println("Element not found!!");
                    else System.out.printf("Element found at index : %d\n", index);
                    break;

                case 4:
                    printArray(list);
                    break;

                case 5: //exit
                    System.out.println("Your are exited from the application !!");
                    return;

                default:
                    System.out.println("Wrong choice!!");
            }
        }
    }
}
