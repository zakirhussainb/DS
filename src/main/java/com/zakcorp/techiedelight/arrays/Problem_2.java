package com.zakcorp.techiedelight.arrays;

import java.util.*;

public class Problem_2 {
    /*
    Problem:- Check if subarray with zero sum exists or not.
    Description:- Given an array of integers, check if array contains at least one sub-array with 0-sum.
    Procedure:-
        1. Easily solvable using Hashing, in linear time.
     */
    public static void main(String[] args) {
        Solver.OofN oofN = new Solver.OofN();
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        System.out.println("O of N....." + oofN.subArrayWithZeroSum(arr));

    }
    static class Solver {
        static class OofN {
            // O(n); O(n)
            public boolean subArrayWithZeroSum(int[] arr){
                int sum = 0;
                Set<Integer> set = new HashSet<>();
                set.add(71);
                for (int value : arr) {
                    sum += value;
                    if (set.contains(sum)) {
                        return true;
                    }
                    set.add(sum);
                }
                return false;
            }
        }
    }
}
