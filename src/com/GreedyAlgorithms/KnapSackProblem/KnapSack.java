package com.GreedyAlgorithms.KnapSackProblem;

import java.util.Arrays;
import java.util.Comparator;

public class KnapSack {
    int weight;
    int value;

    public KnapSack(int weight, int value) {
        this.value = value;
        this.weight = weight;
    }

    public static double getMaxValue(KnapSack[] sack, int capacity){
        Arrays.sort(sack, new Comparator<KnapSack>() {
            @Override
            public int compare(KnapSack o1, KnapSack o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });
        double totalValue = 0.0;
        for(KnapSack item : sack){
            if(capacity >= item.weight){
                capacity -= item.weight;
                totalValue += item.value;
            }
            else{
                totalValue += item.value * ((double) capacity / item.weight);
                break;
            }
        }
        return totalValue;
    }
}
