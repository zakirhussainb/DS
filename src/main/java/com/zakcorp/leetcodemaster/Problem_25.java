package com.zakcorp.leetcodemaster;

import com.zakcorp.final450.linkedlist.P_127;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem_25 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static class Solver {
        public ListNode solve1(ListNode head, int k) {
            int n = getListLength(head);
            int maxGroups = n / k;
            if(head == null || head.next == null)
                return head;
            ListNode curr = head;
            ListNode prev = null;
            Stack<ListNode> stack = new Stack<>();
            int groups = 0;
            while(curr != null && groups < maxGroups) {
                int count = 0;
                while(curr != null && count < k) {
                    stack.push(curr);
                    curr = curr.next;
                    count++;
                }
                while(!stack.isEmpty()) {
                    if(prev == null) {
                        prev = stack.peek();
                        head = prev;
                    } else {
                        prev.next = stack.peek();
                        prev = prev.next;
                    }
                    stack.pop();
                }
                groups++;
            }
            prev.next = curr;
            return head;
        }
        private int getListLength(ListNode head) {
            int len = 0;
            ListNode curr = head;
            while(curr != null) {
                len++;
                curr = curr.next;
            }
            return len;
        }
        public void printList(ListNode head, String text) {
            System.out.println(text);
            ListNode curr = head;
            while(curr != null) {
                System.out.print(curr.val + "->");
                curr = curr.next;
            }
            System.out.println("NULL");
            System.out.println();
        }
    }
}
