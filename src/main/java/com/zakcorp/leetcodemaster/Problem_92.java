package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_92 {
    static class Solver {
        public class ListNode {
            int val;
            ListNode next;
            public ListNode(int val) {
                this.val = val;
            }
        }
        public ListNode solve1(ListNode head, int m, int n) {
            // When head is null
            if(head == null)
                return head;
            // Find three node -> startBefore, start, endNext;
            ListNode curr = head;
            ListNode startBefore = null;
            ListNode start = null;
            ListNode endNext = null;
            int i = 1;
            while(curr != null) {
                if(i == m - 1) {
                    startBefore = curr;
                }
                if(i == m) {
                    start = curr;
                }
                if(i == n + 1) {
                    endNext = curr;
                }
                i++;
                curr = curr.next;
            }
            // Find the mthNode - Covering the edge case
            ListNode mthNode = null;
            if(startBefore == null || startBefore.next == null) {
                mthNode = start;
            } else {
                mthNode = startBefore.next;
            }
            // Reverse the list from m to n
            ListNode r = null;
            ListNode q = null;
            ListNode p = mthNode;
            i = m;
            while(p != null && i <= n) {
                r = q;
                q = p;
                p = p.next;
                q.next = r;
                i++;
            }
            if(startBefore == null || startBefore.next == null) {
                if(endNext != null) {
                    start.next = endNext;
                }
                return q;
            }
            startBefore.next = q;
            start.next = endNext;
            return head;
        }
    }
}
