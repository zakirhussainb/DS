package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

public class Problem_69 {
    static class Solver {
        public SinglyLLIntImpl.Node solve1(SinglyLLIntImpl.Node head1, SinglyLLIntImpl.Node head2) {
            if(head1 == null || head2 == null) {
                return null;
            }
            SinglyLLIntImpl.Node i = head1;
            SinglyLLIntImpl.Node j = head2;
            SinglyLLIntImpl.Node head3 = new SinglyLLIntImpl.Node(0);
            SinglyLLIntImpl.Node dummy = head3;
            while(i != null && j != null) {
                if(i.data == j.data) {
                    dummy.next = new SinglyLLIntImpl.Node(i.data);
                    i = i.next;
                    j = j.next;
                    dummy = dummy.next;
                } else if(i.data < j.data) {
                    i = i.next;
                } else {
                    j = j.next;
                }
            }
            return head3.next;
        }
    }
}
