package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

import java.util.*;

public class Problem_141 {
    static class Solver {
        public boolean solve1(SinglyLLIntImpl.Node head) {
            if(head == null) {
                return true;
            }
            SinglyLLIntImpl.Node curr = head;
            Set<SinglyLLIntImpl.Node> hSet = new HashSet<>();
            while(curr != null) {
                if(!hSet.contains(curr)) {
                    hSet.add(curr);
                } else {
                    return true;
                }
                curr = curr.next;
            }
            return false;
        }
        public boolean solve2(SinglyLLIntImpl.Node head) {
            SinglyLLIntImpl.Node s = head;
            SinglyLLIntImpl.Node f = head;
            while(f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
                if(s == f) {
                    return true;
                }
            }
            return false;
        }
    }
}
