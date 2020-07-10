package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;


public class Problem_142 {
    static class Solver {
        public SinglyLLIntImpl.Node solve1(SinglyLLIntImpl.Node head) {
            boolean cycleDetected = false;
            SinglyLLIntImpl.Node slow = head;
            SinglyLLIntImpl.Node fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast) {
                    cycleDetected = true;
                    break;
                }
            }
            if (cycleDetected) {
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            } else {
                return null;
            }
        }
    }
}
