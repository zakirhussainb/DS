package com.zakcorp.leetcodemaster;

public class Problem_1701 {
    static class Solver {
        public double solve1(int[][] customers) {
            int customerArrivalTime = customers[0][0];
            int chefStartTime = customerArrivalTime;
            int chefEndTime = chefStartTime + customers[0][1];
            // The waiting time must be in double otherwise your test cases will fail.
            double customerWaitTime = chefEndTime - customerArrivalTime;
            for(int i = 1; i < customers.length; i++) {
                customerArrivalTime = customers[i][0];
                chefStartTime = Math.max(chefEndTime, customerArrivalTime);
                chefEndTime = chefStartTime + customers[i][1];
                customerWaitTime += chefEndTime - customerArrivalTime;
            }
            return customerWaitTime / customers.length;
        }
    }
}
