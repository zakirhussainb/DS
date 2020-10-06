package com.zakcorp.leetcodemaster;

public class Problem_143 {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) {
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

        /* while(head != null && head2 != null){
            ListNode temp = head.next;
            head.next = head2;
            head = temp;

            temp = head2.next;
            head2.next = head;
            head2 = temp;
         }*/
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
        // Tweaking the getMiddle method a little in order to fit the problem
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
