package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 05/10/20.
 *
 * @source: Grokking Coding
 * @topic: Fast-Slow Pointers
 * @sub-topic: Palindrome Linked List
 * @platform: LeetCode
 * @problem_link: https://leetcode.com/problems/palindrome-linked-list/
 * @pseudocode:
 */
public class Problem_234 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public boolean solve1(ListNode head) {
            if(head == null)
                return true;
            return toString(head).equals(toString(reverseLinkedList(head)));
        }
        public String toString(ListNode head) {
            StringBuilder sb = new StringBuilder();
            ListNode curr = head;
            while(curr != null) {
                sb.append(curr.val);
                curr = curr.next;
            }
            return sb.toString();
        }
        private ListNode reverseLinkedList(ListNode head) {
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
    }
}