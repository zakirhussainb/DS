package com.zakcorp.final450.greedy;

import java.util.*;

public class P_225 {
    /* Maximum trains for which stoppage can be provided */
    static class Solver {
        public int solve1(int[][] trainArr, int numberOfPlatforms) {
            int m = trainArr.length;
            int n = trainArr[0].length;
            Arrays.sort(trainArr, Comparator.comparingInt(a -> a[2]) );
            int ans = 1;
            for(int pltNo = 1; pltNo <= numberOfPlatforms; pltNo++) {
                PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
                for(int i = 0; i < m; i++) {
                    if(trainArr[i][2] == pltNo) {
                        pq.add(trainArr[i]);
                    }
                }
                int[] org = pq.poll();
                while( !pq.isEmpty() ) {
                    int[] curr = pq.poll();
                    if(org[1] > curr[0]) {
                        ans++;
                    } else {
                        org = curr;
                    }
                }

            }
            return ans;
        }
    }
}
