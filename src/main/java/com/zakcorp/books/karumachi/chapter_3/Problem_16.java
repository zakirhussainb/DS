package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

public class Problem_16 {
    static class Solver {
        public SinglyLLIntImpl.Node solve(SinglyLLIntImpl.Node head, SinglyLLIntImpl.Node t) {
            SinglyLLIntImpl.Node curr = head;
            SinglyLLIntImpl.Node prev = null;
            while(curr != null) {
                if(curr.data > t.data) {
                    if(prev == null) {
                        t.next = head;
                        head = t;
                    } else {
                        prev.next = t;
                        t.next = curr;
                    }
                    break;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            return head;
        }
        public SinglyLLIntImpl.Node solve1(SinglyLLIntImpl.Node head, SinglyLLIntImpl.Node t) {
            SinglyLLIntImpl.Node curr = head;
            SinglyLLIntImpl.Node prev = null;
            while(curr != null && curr.data < t.data) {
                prev = curr;
                curr = curr.next;
            }
            t.next = curr;
            if(prev != null) {
                prev.next = t;
            } else {
                head = t;
            }
            return head;
        }
    }
}
