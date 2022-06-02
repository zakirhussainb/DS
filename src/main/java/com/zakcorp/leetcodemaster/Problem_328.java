package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_328 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next)
        {
            this.val = val;
            this.next = next;
        }
    }
    static class Solver {
        /*
        The approach is very simple
        Iterate the even && even.next pointer, then
        o.n = e.n
        o = o.n
        e.n = o.n
        e = e.n
        then finally make your odd.next point to evenHead
         */
        public ListNode solve1(ListNode head) {
            if(head == null || head.next == null) {
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;
            while(even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
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
