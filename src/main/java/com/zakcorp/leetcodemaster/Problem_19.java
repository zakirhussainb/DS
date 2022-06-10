package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Problem_19 {
    /*
    Brute Force Solution
        1. Calculate the length of the List
        2. Subtract the len with n => len = len - n
        3. Iterate the prev and curr pointer till the new length
        4. if prev is not null assign prev.next to curr.next;
     */
    static class Solver {
        public ListNode solve(ListNode head, int n) {
            int len = getLength(head);
            len = len - n;
            if(len == 0)
                return head.next;
            int i = 0;
            ListNode curr = head;
            ListNode prev = null;
            while(curr != null && i < len) {
                prev = curr;
                i++;
                curr = curr.next;
            }
            if(prev != null)
                prev.next = curr.next;
            return head;
        }
        private int getLength(ListNode head) {
            int len = 0;
            ListNode curr = head;
            while(curr != null) {
                len++;
                curr = curr.next;
            }
            return len;
        }
    }
    /*
    A one pass solution can be done using pointers. Move one pointer fast --> n + 1 places forward,
    to maintain a gap of n between the two pointers and then move both at the same speed.
    Finally, when the fast pointer reaches the end, the slow pointer will be n + 1 places behind -
    just the right spot for it to be able to skip the next node.
    Since the question gives that n is valid, not too many checks have to be put in place. Otherwise, this would be necessary.
     */
    static class Solver1 {
        public ListNode solve(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            ListNode slow = dummy;
            ListNode fast = dummy;
            slow.next = head;
            for(int i = 0; i <= n; i++) {
                fast = fast.next;
            }
            while(fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }
    protected boolean areListsSame(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null) {
            if(l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}
