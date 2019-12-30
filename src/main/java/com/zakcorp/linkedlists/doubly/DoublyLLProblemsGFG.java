package com.zakcorp.linkedlists.doubly;

import java.util.*;

public class DoublyLLProblemsGFG {

    public DoublyLLIntImpl.Node insertInASortedDLL(DoublyLLIntImpl.Node head, int x) {
        // https://www.geeksforgeeks.org/insert-value-sorted-way-sorted-doubly-linked-list/
        /* Time Complexity:- O(n)
         * Space Complexity:- O(1) */
        DoublyLLIntImpl.Node curr = head;
        DoublyLLIntImpl.Node follow = null;
        DoublyLLIntImpl.Node t = new DoublyLLIntImpl.Node(x);
        while (curr != null){
            if(curr.data >= x){
                if(follow == null){
                    t.next = curr;
                    curr.prev = t;
                    return t;
                }
                t.next = follow.next;
                curr.prev = t;
                follow.next = t;
                t.prev = follow;
                break;
            }
            follow = curr;
            curr = curr.next;
        }
        return head;
    }

    protected HashSet<HashSet<Integer>> findPairsWithGivenSum_3(DoublyLLIntImpl.Node head,
                                                                     DoublyLLIntImpl.Node tail, int x) {
        /* This doubly linked list is in sorted condition so we can use the 2-pointer method
        * Time Complexity:- O(n)
        * Space Complexity:- O(1) */
        HashSet<HashSet<Integer>> pairSet = new HashSet<>();
        DoublyLLIntImpl.Node first = head;
        DoublyLLIntImpl.Node last = tail;
        while (first != null && last != null && first != last && last.next != first) {
            HashSet<Integer> set = new HashSet<>();
            if(first.data + last.data < x){
                first = first.next;
            } else if(first.data + last.data > x){
                last = last.prev;
            } else {
                set.add(first.data);
                set.add(last.data);
                pairSet.add(set);
                first = first.next;
                last = last.prev;
            }
        }
        return pairSet;
    }

    protected HashSet<HashSet<Integer>> findPairsWithGivenSum_1(DoublyLLIntImpl.Node head, int x) {
        // https://www.geeksforgeeks.org/find-pairs-given-sum-doubly-linked-list/
        /* This implementation uses extra space by storing the given node.data into a hashSet
        * Time Complexity:- O(n)
        * Space Complexity:- O(n) */
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


    protected HashSet<HashSet<Integer>> findPairsWithGivenSum_2(DoublyLLIntImpl.Node head, int x) {
        /* Time Complexity:- O(n^2)
         * Space Complexity:- O(1) */
        HashSet<HashSet<Integer>> pairSet = new HashSet<>();
        DoublyLLIntImpl.Node p = head;
        while(p != null){
            HashSet<Integer> hSet = new HashSet<>();
            DoublyLLIntImpl.Node q = p.next;
            while (q != null){
                if(x == p.data + q.data){
                    hSet.add(p.data);
                    hSet.add(q.data);
                    pairSet.add(hSet);
                }
                q = q.next;
            }
            p = p.next;
        }
        return pairSet;
    }


    protected void quickSort(DoublyLLIntImpl.Node start, DoublyLLIntImpl.Node end) {
        /* https://www.geeksforgeeks.org/quicksort-for-linked-list/ */
        if(end != null && start != end && start != end.next){
            DoublyLLIntImpl.Node pi = qsPartition(start, end);
            quickSort(start, pi.prev);
            quickSort(pi.next, end);
        }

    }

    protected DoublyLLIntImpl.Node qsPartition(DoublyLLIntImpl.Node start, DoublyLLIntImpl.Node end) {
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

    protected DoublyLLIntImpl.Node reverseDoublyLinkedList(DoublyLLIntImpl.Node head) {
        /* https://www.geeksforgeeks.org/reverse-a-doubly-linked-list/
        * Reversing a DLL using 3-pointer method */

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
        return q;
    }
}
