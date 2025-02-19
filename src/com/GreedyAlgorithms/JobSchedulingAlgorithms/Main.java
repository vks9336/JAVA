package com.GreedyAlgorithms.JobSchedulingAlgorithms;

import java.util.Scanner;

import static com.GreedyAlgorithms.JobSchedulingAlgorithms.JobScheduling.scheduleJobs;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Job[] jobs = {
                new Job(1,4,100),
                new Job(2,5,100),
                new Job(3,1,10),
                new Job(4,3,600),
                new Job(5,6,700),
                new Job(6,9,150)
        };
        System.out.print("Enter the number of time slots : ");
        int n = sc.nextInt();

        int[] scheduledJobs = scheduleJobs(jobs, n);

        int totalProfit = 0;
        System.out.println("Scheduled Jobs:");
        for (int scheduledJob : scheduledJobs) {
            if (scheduledJob != -1) {
                Job job = jobs[scheduledJob];
                System.out.println("Job ID: " + job.jobId + ", Profit: " + job.profit + ", Deadline: " + job.deadline);
                totalProfit += job.profit;
            }
        }
        System.out.println("Total Profit: " + totalProfit);
    }
}
