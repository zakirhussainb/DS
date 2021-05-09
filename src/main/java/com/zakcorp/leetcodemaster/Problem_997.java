package com.zakcorp.leetcodemaster;

public class Problem_997 {
    /*
    EXPLANATION:-
    Given constraints are
    1. The judge believes no one.
    2. Everybody believes judge.
    so, from these two points, we can say that if any person is trusted by N - 1 persons and the same person believes
     no one(i.e. 0), then we can say that he is a judge.
     */
    public int findJudge(int N, int[][] trust) {
        int[] trustScores = new int[N + 1];
        // Calculate the trust score of each person in N.
        // trust score => arr[i] => number of person trust him - number of person he trusts.
        for (int[] relation : trust) {
            trustScores[relation[0]]--; // This person is a believer, so decrementing value.
            trustScores[relation[1]]++; // This person is a judge, so incrementing value.
        }
        //
        for(int i = 1; i <= N; i++) {
            if(trustScores[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
