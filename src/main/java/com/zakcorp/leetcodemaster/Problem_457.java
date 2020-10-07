package com.zakcorp.leetcodemaster;

import java.util.*;

/**
 * Created by Zakir Hussain B on 07/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_457 {
    static class Solver {
        public boolean solve1(int[] arr) {
            int n = arr.length;
            for(int i = 0; i < n; i++) {
                boolean isForward = arr[i] >= 0;
                int slow = i, fast = i;
                do {
                    slow = findNextIndex(arr, isForward, slow);
                    fast = findNextIndex(arr, isForward, fast);
                    if(fast != -1)
                        fast = findNextIndex(arr, isForward, fast);
                }while(slow != -1 && fast != -1 && slow != fast);

                if(slow != -1 && slow == fast)
                    return true;
            }
            return false;
        }

        private int findNextIndex(int[] arr, boolean isForward, int currIndx) {
            boolean direction = arr[currIndx] >= 0;
            if(isForward != direction)
                return -1;

            int nxtIndx = (currIndx + arr[currIndx]) % arr.length;
            if(nxtIndx < 0)
                nxtIndx += arr.length;
            if(nxtIndx == currIndx)
                nxtIndx = -1;

            return nxtIndx;
        }
    }
}