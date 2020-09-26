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
public class Chapter_3 {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode findCycleStart(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head, fast = head;
        boolean cycleDetected = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycleDetected = true;
                break;
            }
        }
        if(cycleDetected) {
            slow = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}