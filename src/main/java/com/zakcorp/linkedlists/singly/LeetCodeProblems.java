package com.zakcorp.linkedlists.singly;

public class LeetCodeProblems {
    public static void main(String[] args) {
        SLinkedListInteger sll = new SLinkedListInteger();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
//        sll.add(6);
//        sll.add(7);
        sll.printListCustom(sll.head);
        int m = 1;
        int n = 4;

        SLinkedListInteger.Node head = problem_92(sll.head, m, n);
        sll.printListCustom(head);
    }
    private static SLinkedListInteger.Node problem_92(SLinkedListInteger.Node head, int m, int n){
        if(head == null){
            return head;
        }
        SLinkedListInteger.Node curr = head;
        SLinkedListInteger.Node startBefore = null;
        SLinkedListInteger.Node endNext = null;
        SLinkedListInteger.Node start = null;
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
        SLinkedListInteger.Node startNode = null;
        if(startBefore == null || startBefore.next == null){
            startNode = start;
        } else {
            startNode = startBefore.next;
        }
        SLinkedListInteger.Node r = null;
        SLinkedListInteger.Node q = null;
        SLinkedListInteger.Node p = startNode;
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
