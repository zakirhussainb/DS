package com.zakcorp.linkedlists.doubly;

import java.util.*;

public class DoublyLLProblems {
    public static void main(String[] args) {
        DoublyLLIntImpl dll = new DoublyLLIntImpl();
        dll.add(1);
        dll.add(2);
        dll.add(4);
        dll.add(5);
        dll.add(6);
        dll.add(8);
        dll.add(9);
//        dll.printListCustom(dll.head);
//        dll.addFirst(59);
        dll.printListCustom(dll.head);
        LinkedList<Integer> linkedList = new LinkedList<>();
//        System.out.println("remFirst...." + dll.removeFirst());
//        System.out.println("remLast...." + dll.removeLast());
//        dll.removeByElement(10);
//        dll.printListCustom(dll.head);

        /* All Problems start from here for the Doubly Linked List*/
        DoublyLLProblems dllProblems = new DoublyLLProblems();
//        DoublyLLIntImpl.Node head = dllProblems.reverseDoublyLinkedList(dll.head);
//        dll.printListCustom(head);

//        System.out.println("tail..." + dll.tail.data);
//        dllProblems.quickSort(dll.head, dll.tail);
//        dll.printListCustom(dll.head);


        HashSet<HashSet<Integer>> pairList = findPairsWithGivenSum(dll.head, 7);
        System.out.println(pairList.toString());

    }

    private static HashSet<HashSet<Integer>> findPairsWithGivenSum(DoublyLLIntImpl.Node head, int x) {
        /* This implementation uses extra space -> O(n) by storing the given node.data into a hashSet
        * Time Complexity:- O(n)*/
        DoublyLLIntImpl.Node curr = head;
        HashSet<Integer> store = new HashSet<>();
        while (curr != null){
            store.add(curr.data);
            curr = curr.next;
        }
        HashSet<HashSet<Integer>> pairSet = new HashSet<>();
        curr = head;
        while(curr != null){
            HashSet<Integer> set = new HashSet<>();
            int diff = x - curr.data;
            if(store.contains(diff)){
                set.add(curr.data);
                set.add(diff);
                pairSet.add(set);
            }
            curr = curr.next;
        }
        return pairSet;
    }

    private void quickSort(DoublyLLIntImpl.Node start, DoublyLLIntImpl.Node end) {
        if(end != null && start != end && start != end.next){
            DoublyLLIntImpl.Node pi = qsPartition(start, end);
            quickSort(start, pi.prev);
            quickSort(pi.next, end);
        }

    }

    private DoublyLLIntImpl.Node qsPartition(DoublyLLIntImpl.Node start, DoublyLLIntImpl.Node end) {
        int pivot = end.data;
        DoublyLLIntImpl.Node i = start.prev;
        for(DoublyLLIntImpl.Node j = start; j != end; j = j.next){
            if(j.data <= pivot){
                i = (i == null) ? start : i.next;

                int temp = i.data;
                i.data = j.data;
                j.data = temp;
            }
        }
        i = (i == null) ? start : i.next;

        int temp = i.data;
        i.data = end.data;
        end.data = temp;
        return i;
    }

    private DoublyLLIntImpl.Node reverseDoublyLinkedList(DoublyLLIntImpl.Node head) {
        DoublyLLIntImpl.Node p = head;
        DoublyLLIntImpl.Node q = null;
        DoublyLLIntImpl.Node r;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
            if(r != null)
                r.prev = q;
        }
        head = q;
        return head;
    }
}
