package com.Recursion_in_JAVA;

import java.util.*;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        } else {
            towerOfHanoi(n - 1, source, destination, helper);
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            towerOfHanoi(n - 1, helper, source, destination);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
    }
}
