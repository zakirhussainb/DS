package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.doubly.DoublyLLIntImpl_V2;

public class P_149 {
    static class Solver {
        public DoublyLLIntImpl_V2.Node solve1(DoublyLLIntImpl_V2.Node head, int n) {
            DoublyLLIntImpl_V2.Node curr = head;
            for(int i = 1; i < n; i++) {
                curr = curr.next;
            }
            DoublyLLIntImpl_V2.Node nthNode = curr;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = head;
            head.prev = curr;

            head = nthNode.next;
            head.prev = null;

            nthNode.next = null;

            return head;
        }
    }
}
