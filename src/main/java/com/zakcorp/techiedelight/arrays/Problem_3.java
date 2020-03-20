package com.zakcorp.techiedelight.arrays;

import java.util.*;

public class Problem_3 {
    /*
    Problem:- Print all sub-arrays with zero-sum.
    Description:- Given an array of integers, check if array contains at least one sub-array with 0-sum.
    Procedure:-
        1. Easily solvable using Hashing, in linear time.
     */
    public static void main(String[] args) {
        Solver.OofNSquare oofNSquare = new Solver.OofNSquare();
//        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        int[] arr = {4, 2, -3, -1, 0, 4};

//        oofNSquare.printAllSubArraysWithZeroSum(arr);
//        System.out.println("Output...." + oofNSquare.printAllSubArraysWithZeroSum(arr, arr.length));

    }
    static class Solver {
        static class OofNSquare {
            public void printAllSubArraysWithZeroSum(int[] arr){
                int n = arr.length;
                for(int i = 0; i < n; i++){
                    int sum = 0;
                    for(int j = i; j < n; j++){
                        sum += arr[j];
                        if(sum == 0){
                            System.out.println("Subarray [" + i + ".." + j + "]");
                        }
                    }
                }
            }
        }
    }
}
