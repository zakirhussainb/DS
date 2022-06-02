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
        public SinglyLLIntImpl.Node solve2(SinglyLLIntImpl.Node head) {
            if(head == null)
                return null;
            SinglyLLIntImpl.Node slow = head;
            SinglyLLIntImpl.Node fast = head;
            SinglyLLIntImpl.Node p1 = null;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    p1 = slow;
                    break;
                }
            }
            if(p1 == null)
                return null;
            SinglyLLIntImpl.Node p2 = head;
            while(p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
            }
            return p1;
        }
    }
}
