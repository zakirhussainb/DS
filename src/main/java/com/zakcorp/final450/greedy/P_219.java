package com.zakcorp.final450.greedy;

import java.util.*;

public class P_219 {
    /*
    N meetings in one room - "You are given n activities with their start and finish times.
    Select the maximum number of activities that can be performed by a single person, assuming that a person can only
    work on a single activity at a time."

    Step 1: Sort the Pair(start, end) with respect to the finishing time.
    Step 2: Select the first activity and compare it with other activities, based on the following rule,
    the start time of the subsequent activity must be greater than or equal to the finish time of the selected activity
     */
    static class Solver {
        public int solve1(int[] start, int[] end, int N) {
            // Sorts the Pair with their respective finishing times
            PriorityQueue<Pair> pq = new PriorityQueue<>(new FinishTimeComparator());
            for(int i = 0; i < N; i++) {
                pq.add(new Pair(start[i], end[i]));
            }

            Pair currActivity = !pq.isEmpty() ? pq.poll() : null;
            int maxMeetings = currActivity != null ? 1 : 0;
            while( !pq.isEmpty() ) {
                Pair nextActivity = pq.poll();
                if(nextActivity.U >= currActivity.V) {
                    maxMeetings++;
                    currActivity = nextActivity;
                }
            }
            return maxMeetings;
        }
    }
    static class Pair {
        int U;
        int V;
        public Pair(int U, int V) {
            this.U = U;
            this.V = V;
        }
    }
    static class FinishTimeComparator implements Comparator<Pair>{
        @Override
        public int compare(Pair p1, Pair p2) {
            return Integer.compare(p1.V, p2.V);
        }
    }
}
