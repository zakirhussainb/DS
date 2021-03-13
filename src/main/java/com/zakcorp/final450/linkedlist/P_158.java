package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.singly.SLinkedList;

public class P_158 {

    static class Solver {
        public SLinkedList.Node<Integer> solve1(SLinkedList.Node<Integer> head) {
            SLinkedList.Node<Integer> revHead = reverseList(head);
            SLinkedList.Node<Integer> q = revHead;
            SLinkedList.Node<Integer> p = revHead.next;
            int max = Integer.MIN_VALUE;
            while(p != null) {
                if(q.element > max) {
                    max = q.element;
                }
                if(p.element < max) {
                    q.next = p.next;
                } else {
                    q = p;
                }
                p = p.next;
            }
            return reverseList(revHead);
        }
        private SLinkedList.Node<Integer> reverseList(SLinkedList.Node<Integer> head) {
            if(head == null || head.next == null)
                return head;
            SLinkedList.Node<Integer> p = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}
