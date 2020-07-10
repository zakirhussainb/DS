package com.zakcorp.books.karumachi.chapter_3;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

public class Problem_15 {
    static class Solver {
        public int solve(SinglyLLIntImpl.Node head) {
            boolean isLoopExists = false;
            SinglyLLIntImpl.Node slow = head;
            SinglyLLIntImpl.Node fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    isLoopExists = true;
                    break;
                }
            }
            int length = 0;
            if(isLoopExists) {
                do {
                    slow = slow.next;
                    length++;
                } while (slow != fast);
            }
            return length;
        }
    }
}
