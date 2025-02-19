package com.GreedyAlgorithms.JobSchedulingAlgorithms;

public class Job {
    int jobId;
    int profit;
    int deadline;

    public Job(int jobId, int deadline, int profit) {
        this.jobId = jobId;
        this.deadline = deadline;
        this.profit = profit;
    }
}
