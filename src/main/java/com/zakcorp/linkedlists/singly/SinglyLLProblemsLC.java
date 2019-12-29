package com.zakcorp.linkedlists.singly;

public class SinglyLLProblemsLC {

    protected SinglyLLIntImpl.Node problem_92(SinglyLLIntImpl.Node head, int m, int n){
        /* https://leetcode.com/problems/reverse-linked-list-ii/ */
        if(head == null){
            return head;
        }
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node startBefore = null;
        SinglyLLIntImpl.Node endNext = null;
        SinglyLLIntImpl.Node start = null;
//        int size = 0;
        int i = 1;
        while(curr != null){
            if(i == m - 1){
                startBefore = curr;
            }
            if(i == m){
                start = curr;
            }
            if(i == n + 1){
                endNext = curr;
            }
            i++;
//            size++;
            curr = curr.next;
        }
//        System.out.println("size..." + size);
        SinglyLLIntImpl.Node startNode = null;
        if(startBefore == null || startBefore.next == null){
            startNode = start;
        } else {
            startNode = startBefore.next;
        }
        SinglyLLIntImpl.Node r = null;
        SinglyLLIntImpl.Node q = null;
        SinglyLLIntImpl.Node p = startNode;
        i = m;
        while(i <= n && p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
            i++;
        }
        /*for(i = m; i <= n; i++){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }*/
        if(startBefore == null || startBefore.next == null){
            if (endNext != null) {
                start.next = endNext;
            }
            return q;
        }
        startBefore.next = q;
        start.next = endNext;
        return head;
    }
}
