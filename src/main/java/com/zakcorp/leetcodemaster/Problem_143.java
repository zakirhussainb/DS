package com.zakcorp.leetcodemaster;

public class Problem_143 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }
        // Find Middle
        ListNode mid = getMiddle(head);
        // Reverse the head2
        ListNode head2 = reverseList(mid.next);
        // Break list 1
        mid.next = null;

        // Combine both in the required order
        while(head != null && head2 != null){
            ListNode t1 = head.next;
            ListNode t2 = head2.next;
            head2.next = head.next;
            head.next = head2;
            head = t1;
            head2 = t2;
        }
    }

    private ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode q = null;
        ListNode r = null;
        while(p != null) {
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
