package com.zakcorp.techiedelight.arrays;

import java.util.*;

public class Problem_4 {
    /*
    Problem:- Sort a Binary Array in Linear Time
    Description:- Given a binary array, sort it in linear time and constant space. Output should print contain all zeroes
    followed by ones.
    TODO:- Procedure:-
        1.
     */
    public static void main(String[] args) {
        Solver solver = new Solver();
        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1};
        solver.sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static class Solver {
        public void sortBinaryArray(int[] arr){
            int n = arr.length;
            int[] countArr = new int[2];
            for(int i : arr){
                countArr[i]++;
            }
            int k = 0;
            while(k < n){
                arr[k++] = (k <= countArr[0]) ? 0 : 1;
            }
        }
    }
}
