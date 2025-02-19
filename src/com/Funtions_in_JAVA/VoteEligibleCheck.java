package com.Funtions_in_JAVA;

import java.util.*;

public class VoteEligibleCheck {
    public static void ageCheckForVote(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        ageCheckForVote(age);
    }
}
