package com.zakcorp.leetcodemaster;

public class Problem_148 {
    static class ListNode {
        ListNode next;
        int val;
        public ListNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null)
                return head;

            // Find the middle node
            ListNode mid = getMiddle(head);
            // Save the middle node to a pointer
            ListNode midNext = mid.next;
            // Cut the list -> By making middle's next point to null
            mid.next = null;
            // Construct left half of the list
            ListNode left = sortList(head);
            // Construct right half of the list
            ListNode right = sortList(midNext);

            // Merge both the list node's
            return merge(left, right);
        }
        private ListNode merge(ListNode left, ListNode right) {
            if(left == null)
                return right;
            if(right == null)
                return left;
            ListNode dummy = new ListNode(-1);
            ListNode l3 = dummy;
            while(left != null && right != null) {
                if(left.val <= right.val) {
                    dummy.next = new ListNode(left.val);
                    left = left.next;
                } else {
                    dummy.next = new ListNode(right.val);
                    right = right.next;
                }
                dummy = dummy.next;
            }
            if(left != null) {
                dummy.next = left;
            }
            if(right != null) {
                dummy.next = right;
            }
            return l3.next;
        }
        private ListNode getMiddle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public void printList(ListNode head) {
            ListNode curr = head;
            while(curr != null) {
                System.out.print(curr.val + "->");
                curr = curr.next;
            }
        }
    }
}
