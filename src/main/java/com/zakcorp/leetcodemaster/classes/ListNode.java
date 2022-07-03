package com.zakcorp.leetcodemaster.classes;

import com.zakcorp.linkedlists.singly.SLinkedList;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public void addLast(ListNode head, int element){
        if(head == null){
            head = new ListNode(element);
            return;
        }
        ListNode p = head;
        while(p.next != null){
            p = p.next;
        }
        ListNode t = new ListNode(element);
        t.next = null;
        p.next = t;
    }
}
