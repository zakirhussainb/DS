package com.zakcorp.leetcodemaster;

public class Problem_21 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solver {
        public ListNode solve1(ListNode l1, ListNode l2) {
            if(l1 == null)
                return l2;
            if(l2 == null)
                return l1;
            ListNode l3 = new ListNode(-1);
            ListNode resultHead = l3;
            while(l1 != null && l2 != null) {
                if(l1.val > l2.val) {
                    l3.next = new ListNode(l2.val);
                    l2 = l2.next;
                } else {
                    l3.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                l3 = l3.next;
            }
            while(l1 != null) {
                l3.next = new ListNode(l1.val);
                l1 = l1.next;
                l3 = l3.next;
            }
            while(l2 != null) {
                l3.next = new ListNode(l2.val);
                l2 = l2.next;
                l3 = l3.next;
            }
            return resultHead.next;
        }
    }
}
