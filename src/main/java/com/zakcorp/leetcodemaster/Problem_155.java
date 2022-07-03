package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_155 {
    static class MinStack {
        private Node head;
        private static class Node {
            Node next;
            int min;
            int val;
            private Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
        public void push(int x) {
            if(head == null){
                head = new Node(x, x, null);
            } else {
                head = new Node(x, Math.min(x, head.min), head);
            }
        }
        public void pop() {
            head = head.next;
        }
        public int top() {
            return head.val;
        }
        public int getMin() {
            return head.min;
        }
    }
}
