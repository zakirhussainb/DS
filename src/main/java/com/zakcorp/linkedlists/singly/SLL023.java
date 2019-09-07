package com.zakcorp.linkedlists.singly;

public class SLL023 {
    /*
    Check for loop in a Singly Linked List
    Approach:- Using two pointer process
               * One pointer p, should move one step.
               * One pointer q, should move two steps.
               * If both pointer meet at same point, then loop exists.
     */
    public static void main(String[] args) {
        LinkedList101<Integer> linkedList = new LinkedList101<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.print();
        linkedList.head.next.next.next.next = linkedList.head;
        SLL023 p = new SLL023();
        System.out.println(p.isLoopExists(linkedList));
    }

    private boolean isLoopExists(LinkedList101<Integer> linkedList) {
        LinkedList101.Node p = linkedList.head;
        LinkedList101.Node q = linkedList.head;
        while(p != null && q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if(p == q){
                return true;
            }
        }
        return false;
    }
}
