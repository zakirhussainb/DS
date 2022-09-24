package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class L7_AllKindsOfPatternsInRecursion {
    static class PrintAllSubsequencesWhoseSumIsK {
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

    static class PrintAnyOneSubsequencesWhoseSumIsK {
        /*
           Concept : given an array -> [1, 1, 2] and K = 2
           We need to print all the subsequences for this array whose sum is 2
           Output :
           [1, 1]
        */
        public void printAnyOneSubsequenceWhoseSumIsK(int[] arr, int k) {
            recursivePrint(0, arr, new ArrayList<>(), new int[]{0}, k);
        }

        private boolean recursivePrint(int index, int[] arr, List<Integer> list, int[] sum, int k) {
            if(index >= arr.length) {
                if(sum[0] == k) {
                    System.out.println(new ArrayList<>(list));
                    return true;
                }
                return false;
            }
            // take or pick the element in this index into the subsequence
            list.add(arr[index]);
            sum[0] += arr[index];
            if ( recursivePrint(index + 1, arr, list, sum, k) )
                return true;
            // not take or not pick the element -> probably the last element in the list
            list.remove(list.size() - 1);
            sum[0] -= arr[index];
            return recursivePrint(index + 1, arr, list, sum, k);
        }
    }

    static class CountAllTheSubsequencesWhoseSumIsK {
        /*
           Concept : given an array -> [1, 1, 2] and K = 2
           We need to count all the subsequences for this array whose sum is 2
           Output :
           2 since, [1,1] and [2]
        */
        public int countAllSubsequenceWhoseSumIsK(int[] arr, int k) {
            return recursiveCount(0, arr, new int[]{0}, k);
        }

        private int recursiveCount(int index, int[] arr, int[] sum, int k) {
            if(index >= arr.length) {
                if(sum[0] == k) {
                    return 1;
                }
                return 0;
            }
            // take or pick the element in this index into the subsequence
            sum[0] += arr[index];
            int left = recursiveCount(index + 1, arr, sum, k);
            // not take or not pick the element -> here you need to subtract from the sum
            sum[0] -= arr[index];
            int right = recursiveCount(index + 1, arr, sum, k);
            return left + right;
        }

    }
}
