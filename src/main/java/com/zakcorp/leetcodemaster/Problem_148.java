package com.zakcorp.leetcodemaster;

import java.util.HashMap;
import java.util.Map;

public class Problem_148 {
    static class Node {
        Node next;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public Node mergeSort(Node head) {
            if(head == null || head.next == null) {
                return head;
            }
            // Find Middle Element
            Node mid = findMid(head);
            Node midNext = mid.next;
            mid.next = null;
            // Make Left
            Node left = mergeSort(head);
            // Make Right
            Node right = mergeSort(midNext);

            // On return you need to merge the nodes
            return merge(left, right);
        }
        private Node merge(Node head1, Node head2) {
            Node dummy = new Node(0);
            Node head3 = dummy;
            if(head1.val <= head2.val) {
                head3.next = new Node(head1.val);
            } else {
                head3.next = new Node(head2.val);
            }
            head3 = head3.next;
            return dummy.next;
        }
        private Node findMid(Node head) {
            Node slow = head;
            Node fast = head.next;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        private void printList(Node head) {
            Node curr = head;
            while(curr != null) {
                System.out.print(curr.val + "->");
                curr = curr.next;
            }
            System.out.println();
        }
    }
}
