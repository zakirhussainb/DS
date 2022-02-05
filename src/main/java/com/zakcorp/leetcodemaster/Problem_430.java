package com.zakcorp.leetcodemaster;

public class Problem_430 {
    static class Node {
        public int val;
        public Node next;
        public Node prev;
        public Node child;
        public Node(int val) {
            this.val = val;
        }
    }
    public Node flatten(Node head) {
        Node p = head;
        while(p != null) {
            Node c = p.child;
            Node curr = p;
            Node pNext = p.next;
            while(c != null) {
                curr.next = c;
                c.prev = curr;
                curr = c;
                c = c.next;
            }
            curr.next = pNext;
            if(pNext != null)
                pNext.prev = curr;
            p.child = null;
            p = p.next;
        }
        return head;
    }

    public void printDLL(Node head) {
        Node curr = head;
        while(curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
    }
}
