package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_B {
    static class Solver {
        public int solve1(int[] players, int[] trainers) {
            Arrays.sort( players );
            Arrays.sort( trainers );
            int i = players.length - 1;
            int j = trainers.length - 1;
            int ans = 0;
            while(i >= 0 && j >= 0) {
                if(players[i] <= trainers[j]) {
                    ans++;
                    i--;
                    j--;
                } else {
                    i--;
                }
            }
            return ans;
        }
    }
}
