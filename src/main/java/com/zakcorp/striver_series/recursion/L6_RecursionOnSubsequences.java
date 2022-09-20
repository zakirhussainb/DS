package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class L6_RecursionOnSubsequences {
    /*
    Concept : given an array -> [3, 1, 2]
    We need to print all the subsequences for this array
    Output :
    [],
    [3]
    [1]
    [2]
    [3,1]
    [3,2]
    [1,2]
    [3,1,2]
     */
    public void printAllSubsequences(int[] arr) {
        recursivePrint(0, arr, new ArrayList<>());
    }

    private void recursivePrint(int index, int[] arr, List<Integer> list) {
        if(index >= arr.length) {
            System.out.println(new ArrayList<>(list));
            return;
        }
        // take or pick the element in this index into the subsequence
        list.add(arr[index]);
        recursivePrint(index + 1, arr, list);
        // not take or not pick the element -> probably the last element in the list
        list.remove(list.size() - 1);
        recursivePrint(index + 1, arr, list);
    }
}
