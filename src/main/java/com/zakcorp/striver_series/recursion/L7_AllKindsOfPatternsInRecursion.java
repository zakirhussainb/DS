package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class L7_AllKindsOfPatternsInRecursion {
    /*
    Concept : given an array -> [1, 1, 2] and K = 2
    We need to print all the subsequences for this array whose sum is 2
    Output :
    [1, 1]
    [2]
     */
    public void printAllSubsequencesWhoseSumIsK(int[] arr, int k) {
        recursivePrint(0, arr, new ArrayList<>(), new int[]{0}, k);
    }

    private void recursivePrint(int index, int[] arr, List<Integer> list, int[] sum, int k) {
        if(index >= arr.length) {
            if(sum[0] == k) {
                System.out.println(new ArrayList<>(list));
            }
            return;
        }
        // take or pick the element in this index into the subsequence
        list.add(arr[index]);
        sum[0] += arr[index];
        recursivePrint(index + 1, arr, list, sum, k);
        // not take or not pick the element -> probably the last element in the list
        list.remove(list.size() - 1);
        sum[0] -= arr[index];
        recursivePrint(index + 1, arr, list, sum, k);
    }
}
