package com.zakcorp.hackerrank;

/**
 * Created by Zakir Hussain B on 15/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class BreakingTheRecords {
    // 10 5 20 20 4 5 2 25 1
    public int[] breakingRecords(int[] scores) {
        int currMax = scores[0], currMin = scores[0];
        int hs = 0, ls = 0;
        for(int i = 1; i < scores.length; i++) {
            if(scores[i] > currMax) {
                currMax = scores[i];
                hs++;
            } else if(scores[i] < currMin) {
                currMin = scores[i];
                ls++;
            }
        }
        int[] result = new int[2];
        result[0] = hs;
        result[1] = ls;
        return result;
    }
}