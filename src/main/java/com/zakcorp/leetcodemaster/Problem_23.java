package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_23 {
    /*
    Uses merge two sorted lists solution
    1. Merge sorted lists in the form of two, and then assign the answer to the newList;
     */
    static class Solver {
        public ListNode solve1(ListNode[] lists) {
            ListNode newList = lists[0];
            for(int i = 1; i < lists.length; i++) {
                newList = mergeTwoSortedLists(newList, lists[i]);
            }
            return newList;
        }
    }
    /*
    Divide and Conquer Approach -> Best Case Time Complexity
    1. Pair up k lists and merge each pair.
     */
    static class Solver1 {
        public ListNode solve1(ListNode[] lists) {
             if(lists.length == 0)
                 return null;
             int interval = 1;
             while(interval < lists.length) {
                 for(int i = 0; i + interval < lists.length; i += 2 * interval) {
                    lists[i] = mergeTwoSortedLists(lists[i], lists[i + interval]);
                 }
                 interval *= 2;
             }
             return lists[0];
        }
    }
    /*
    Divide and Conquer Approach -> Best Case Time Complexity
    Super solution and easy to remember.
     */
    static class Solver2 {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0)
                return null;
            return mergeUsingDivideAndConquer(lists, 0, lists.length - 1);
        }
        private ListNode mergeUsingDivideAndConquer(ListNode[] lists, int low, int high) {
            if(low > high)
                return null;
            if(low == high)
                return lists[low];
            int mid = low + (high - low) / 2;

            ListNode rootL = mergeUsingDivideAndConquer(lists, low, mid);
            ListNode rootR = mergeUsingDivideAndConquer(lists, mid + 1, high);
            return mergeTwoSortedLists(rootL, rootR);
        }
    }
    private static ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode l3 = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                dummy.next = l1;
                l1 = l1.next;
            } else {
                dummy.next = l2;
                l2 = l2.next;
            }
            dummy = dummy.next;
        }
        if(l1 != null)
            dummy.next = l1;
        if(l2 != null)
            dummy.next = l2;
        return l3.next;
    }
}
