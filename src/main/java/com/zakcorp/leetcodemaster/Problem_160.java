package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;
import java.util.*;

public class Problem_160 {
    static class Solver {
        public SinglyLLIntImpl.Node solve1(SinglyLLIntImpl.Node headA, SinglyLLIntImpl.Node headB) {
            if(headA == null || headB == null) {
                return null;
            }
            Set<SinglyLLIntImpl.Node> set = new HashSet<>();
            SinglyLLIntImpl.Node curr = headA;
            while(curr != null) {
                set.add(curr);
                curr = curr.next;
            }
            curr = headB;
            while(curr != null) {
                if(set.contains(curr)) {
                    return curr;
                }
                curr = curr.next;
            }
            return null;
        }
        public SinglyLLIntImpl.Node solve2(SinglyLLIntImpl.Node headA, SinglyLLIntImpl.Node headB) {
            if(headA == null || headB == null) {
                return null;
            }
            int l1 = findLength(headA);
            int l2 = findLength(headB);
            int d = (l1 > l2) ? l1 - l2 : l2 - l1;
            SinglyLLIntImpl.Node currA = headA;
            SinglyLLIntImpl.Node currB = headB;
            if(l1 > l2) {
                currA = skipSteps(headA, d);
            } else {
                currB = skipSteps(headB, d);
            }
            while(currA != null) {
                if(currA == currB) {
                    return currA;
                }
                currA = currA.next;
                currB = currB.next;
            }
            return null;
        }
        public SinglyLLIntImpl.Node skipSteps(SinglyLLIntImpl.Node head, int d) {
            SinglyLLIntImpl.Node curr = head;
            for(int i = 0; i < d && curr != null; i++) {
                curr = curr.next;
            }
            return curr;
        }
        public int findLength(SinglyLLIntImpl.Node head) {
            int length = 0;
            SinglyLLIntImpl.Node curr = head;
            while(curr != null) {
                length++;
                curr = curr.next;
            }
            return length;
        }
    }
}
