package com.zakcorp.linkedlists.doubly;

import java.util.LinkedList;

public class DoublyLLDriver {
    public static void main(String[] args) {
        /*DoublyLLIntImpl dll = new DoublyLLIntImpl();
        dll.add(6);
        dll.add(8);
        dll.add(9);
        dll.add(5);
        dll.add(1);
        dll.add(3);
        dll.add(2);
//        dll.printListCustom(dll.head);
//        dll.addFirst(59);
        dll.printListCustom(dll.head);
        LinkedList<Integer> linkedList = new LinkedList<>();
//        System.out.println("remFirst...." + dll.removeFirst());
//        System.out.println("remLast...." + dll.removeLast());
//        dll.removeByElement(10);
//        dll.printListCustom(dll.head);

        *//* All Problems start from here for the Doubly Linked List*//*
        DoublyLLProblemsGFG dllProblems = new DoublyLLProblemsGFG();
//        DoublyLLIntImpl.Node head = dllProblems.reverseDoublyLinkedList(dll.head);
//        dll.printListCustom(head);

//        dllProblems.quickSort(dll.head, dll.tail);
//        dll.printListCustom(dll.head);


//        HashSet<HashSet<Integer>> pairList = findPairsWithGivenSum_1(dll.head, 7);
//        System.out.println(pairList.toString());

//        HashSet<HashSet<Integer>> pairList = findPairsWithGivenSum_2(dll.head, 7);
//        System.out.println(pairList.toString());

//        HashSet<HashSet<Integer>> pairSet = findPairsWithGivenSum_3(dll.head, dll.tail, 7);
//        System.out.println(pairSet.toString());

        dllProblems.insertInASortedDLL(dll.head, 3);
        DoublyLLIntImpl.Node head = dllProblems.insertInASortedDLL(dll.head, 7);
        dll.printListCustom(head);*/

        /* Version 2 Driver test*/
        DoublyLLIntImpl_V2 dllV2 = new DoublyLLIntImpl_V2();
        dllV2.addLast(10);
        dllV2.addLast(20);
        dllV2.addLast(30);
        dllV2.addLast(40);
        dllV2.addLast(50);
        dllV2.addLast(60);
        dllV2.printList();
        dllV2.addFirst(9);
        dllV2.printList();
        System.out.println("Size:- " + dllV2.size);
        dllV2.add(4, 25);
        dllV2.add(1, 5);
        dllV2.printList();
        dllV2.add(10, 65);
        dllV2.printList();
        dllV2.add(7, 35);
        dllV2.printList();
        System.out.println(dllV2.deleteFirst());
        dllV2.printList();
        System.out.println(dllV2.deleteLast());
        dllV2.printList();
        dllV2.deleteMatched(40);
        dllV2.printList();
        dllV2.deleteMatched(9);
        dllV2.printList();
        dllV2.deleteMatched(60);
        dllV2.printList();
    }
}
