package com.zakcorp.leetcodemaster;

public class Problem_997 {
    /*
    EXPLANATION:-
    Given constraints are
    1. The judge believes no one.
    2. Everybody believes judge.
    so, from these two points, we can say that if any person is trusted by N - 1 persons and the same person believes
     no one, then we can say that he is a judge.
     */
    public int findJudge(int N, int[][] trust) {
        int[] arr = new int[N + 1];
        // Calculate the trust score of each person in N.
        // trust score => arr[i] => number of person trust him - number of person he trusts.
        for(int person = 0; person < trust.length; person++) {
            arr[trust[person][0]]--; // This person is a believer, so decrementing value.
            arr[trust[person][1]]++; // This person is a judge, so incrementing value.
        }
        //
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == N - 1) {
                return i;
            }
        }
        return -1;
    }
}
