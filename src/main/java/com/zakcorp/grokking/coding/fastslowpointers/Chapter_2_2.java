package com.zakcorp.grokking.coding.fastslowpointers;

/**
 * Created by Zakir Hussain B on 23/09/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Chapter_2_2 {
    // For Tests refer:-
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public int detectCycleAndGetLength(ListNode head) {
        if(head == null) {
            return -1;
        }
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return calculateLength(slow);
            }
        }
        return -1;
    }
    private int calculateLength(ListNode slow) {
        ListNode curr = slow;
        int cycleLength = 0;
        do {
            curr = curr.next;
            cycleLength++;
        }while(curr != slow);
        return cycleLength;
    }
}