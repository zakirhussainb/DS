package com.zakcorp.final450.linkedlist;

import com.zakcorp.linkedlists.doubly.DoublyLLIntImpl_V2;

public class P_147 {
    static class Solver {
        public int solve1(DoublyLLIntImpl_V2.Node head, int target) {
            DoublyLLIntImpl_V2.Node p = head;
            DoublyLLIntImpl_V2.Node lastNode = getLast(head);
            int resultCount = 0;
            while(p != null) {
                DoublyLLIntImpl_V2.Node q = p.next;
                DoublyLLIntImpl_V2.Node r = lastNode;
                while(q != null && r != null && q != r && r.next != q) {
                    int sum = p.data + q.data + r.data;
                    if(sum == target) {
                        resultCount++;
                        q = q.next;
                        r = r.prev;
                    } else if(sum < target) {
                        q = q.next;
                    } else {
                        r = r.prev;
                    }
                }
                p = p.next;
            }
            return resultCount;
        }
        private DoublyLLIntImpl_V2.Node getLast(DoublyLLIntImpl_V2.Node head) {
            DoublyLLIntImpl_V2.Node last = head;
            while(last.next != null) {
                last = last.next;
            }
            return last;
        }
    }
}
