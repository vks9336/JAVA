package com.GreedyAlgorithms.JobSchedulingAlgorithms;

import java.util.Arrays;

public class JobScheduling {
    public static int[] scheduleJobs(Job[] jobs, int n){
        Arrays.sort(jobs, (a,b) -> b.profit - a.profit);
        boolean[] slots = new boolean[n];

        int[] result = new int[n];

        Arrays.fill(slots, false);
        Arrays.fill(result, -1);

        for (int i = 0; i < jobs.length; i++) {
            for (int j = Math.min(n - 1, jobs[i].deadline - 1); j >= 0; j--) {
                if(!slots[j]){
                    slots[j] = true;
                    result[j] = i;
                    break;
                }
            }
        }
        return result;
    }
}
