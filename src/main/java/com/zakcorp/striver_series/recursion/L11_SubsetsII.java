package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L11_SubsetsII
{
    /*
    Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
    The solution set must not contain duplicate subsets. Return the solution in any order.
     */
    static class Solver {
        /*
        Each recursion level focuses on all the elements in the array. We scan through all the elements and
        decide whether to choose or not choose that element. (Every level split into N branches.)
         */
        public List<List<Integer>> subsetsWithoutDup(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, arr, new ArrayList<>(), result);
            return result;
        }
        private void backtrack(int index, int[] arr, List<Integer> list, List<List<Integer>> result) {
            result.add(new ArrayList<>(list));
            for(int i = index; i < arr.length; i++) {
                if(i > index && arr[i] == arr[i - 1])
                    continue;
                list.add(arr[i]);
                backtrack(i + 1, arr, list, result);
                list.remove(list.size() - 1);
            }
        }
    }

    static class Solver1 {
        /*
        Each recursion level focuses on one element, we need to decide choose or not choose this element.
        (Every level split into 2 branches.)
         */
        public List<List<Integer>> subsetsWithoutDup(int[] arr) {
            Arrays.sort(arr);
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, arr, new ArrayList<>(), result, false);
            return result;
        }
        private void backtrack(int index, int[] arr, List<Integer> list, List<List<Integer>> result, boolean choosePre) {
            if(index >= arr.length) {
                result.add(new ArrayList<>(list));
                return;
            }
            backtrack(index + 1, arr, list, result, false);
            if(index >= 1 && arr[index] == arr[index - 1] && !choosePre)
                return;
            list.add(arr[index]);
            backtrack(index + 1, arr, list, result, true);
            list.remove(list.size() - 1);
        }
    }
}
