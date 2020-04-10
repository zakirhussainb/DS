package com.zakcorp.techiedelight.arrays;

import java.util.*;

public class Problem_1 {
    /*
    Problem:- Find pair with given sum in an array.
    Description:- Given an unsorted array of integers, find a pair with given sum in it.
    Procedure:-
        1. Method 1:- Consider every pair in given array and return if desired sum is found. O(n^2) and O(1)
        2. Method 2:- Use HashMap to maintain the [Key - arr[i], Value - i]
     */
    public static void main(String[] args) {
        Solver.OofNSquare nSquare = new Solver.OofNSquare();
        Solver.OofN oofN = new Solver.OofN();
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        System.out.println("O of NSquare...." + Arrays.toString(nSquare.pair(arr, sum)));
        System.out.println("O of N....." + Arrays.toString(oofN.pair(arr, sum)));
        HashMap<Integer, Integer> hMap = new HashMap<>();
        Integer count = hMap.get(1);

    }
    static class Solver {
        static class OofNSquare {
            // O(n^2); O(1)
            public int[] pair(int[] arr, int sum){
                int[] result = new int[2];
                int n = arr.length;
                int k = 0;
                for(int i = 0; i < n - 1; i++){
                    for(int j = i + 1; j < n; j++){
                        if(arr[i] + arr[j] == sum){
                            result[k++] = i;
                            result[k] = j;
                            return result;
                        }
                    }
                }
                return result;
            }

        }
        static class OofN {
            // O(n); O(n)
            public int[] pair(int[] arr, int sum){
                int[] result = new int[2];
                int k = 0;
                int n = arr.length;
                HashMap<Integer, Integer> hMap = new HashMap<>();
                for(int i = 0; i < n; i++) {
                    if(hMap.containsKey(sum - arr[i])) {
                        result[k++] = hMap.get(sum - arr[i]);
                        result[k] = i;
                        return result;
                    }
                    hMap.put(arr[i], i);
                }
                return result;
            }
        }
    }
}
