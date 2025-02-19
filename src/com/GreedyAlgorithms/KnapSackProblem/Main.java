package com.GreedyAlgorithms.KnapSackProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KnapSack[] sack = {
                new KnapSack(10,60),
                new KnapSack(20,80),
                new KnapSack(30,100),
                new KnapSack(40,120),
                new KnapSack(50,140)
        };
        int capacity = 50;
        int maxValue = (int) KnapSack.getMaxValue(sack, capacity);
        System.out.println("Maximum Profit is :" +  maxValue);
    }
}
