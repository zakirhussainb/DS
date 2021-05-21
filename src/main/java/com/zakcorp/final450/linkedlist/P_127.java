package com.zakcorp.final450.linkedlist;

import java.util.Stack;

public class P_127 {
    static class Node {
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
        }
    }
    static class Solver {
        public Node solve1(Node head, int k) {
            if(head == null || head.next == null)
                return head;
            Node curr = head;
            Node prev = null;
            Stack<Node> stack = new Stack<>();
            while(curr != null) {
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
            }
            prev.next = null;
            return head;
        }
        public void printList(Node head, String text) {
            System.out.println(text);
            Node curr = head;
            while(curr != null) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
            System.out.println("NULL");
            System.out.println();
        }
    }
}
