package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_206 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public ListNode solve1(ListNode head) {
            ListNode r = null;
            ListNode q = null;
            ListNode p = head;
            while(p != null) {
                r = q;
                q = p;
                p = p.next;
                q.next = r;
            }
            head = q;
            return head;
        }
    }
}
