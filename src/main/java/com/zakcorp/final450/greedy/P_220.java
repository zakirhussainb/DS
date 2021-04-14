package com.zakcorp.final450.greedy;

import java.util.*;

public class P_220 {
    /*
    Job Sequencing Problem
    Given a set of N jobs where each job i has a deadline and profit associated to it. Each job takes 1 unit of time to
    complete and only one job can be scheduled at a time. We earn the profit if and only if the job is completed
    by its deadline. The task is to find the maximum profit and the number of jobs done.
    Note: Jobs will be given in the form (Job id, Deadline, Profit) associated to that Job.
     */
    static class Job {
        int id;
        int deadline;
        int profit;
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    static class Solver {

    }
}
