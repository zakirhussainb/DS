package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_147 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public ListNode solve1(ListNode head) {
            if(head == null) {
                return null;
            }

            return head;
        }
        public int[] solve2(int[] arr) {
            // 12, 11, 13, 5, 6
            int n = arr.length;
            for(int i = 1; i < n; i++) {
                int val = arr[i];
                int idx = i;
                while(idx > 0 && arr[idx - 1] > val) {
                    arr[idx] = arr[idx - 1];
                    idx--;
                }
                arr[idx] = val;
            }
            return arr;
        }
    }














    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 5, 3};
        int[] result = insertionSortArr(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] insertionSortArr(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole - 1] > value){
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = value;
        }
        return arr;
    }
}
