package com.zakcorp.leetcodemaster;

import com.zakcorp.linkedlists.singly.SinglyLLIntImpl;

public class Problem_876 {
    public SinglyLLIntImpl.Node middleNode(SinglyLLIntImpl.Node head) {
        if(head == null) {
            return null;
        }
        SinglyLLIntImpl.Node slow = head;
        SinglyLLIntImpl.Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
