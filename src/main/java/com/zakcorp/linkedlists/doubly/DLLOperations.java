package com.zakcorp.linkedlists.doubly;

public class DLLOperations {
    public static void main(String[] args) {
        DLinkedList<Integer> linkedList = new DLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addLast(30);
        linkedList.addFirst(5);
        linkedList.add(2, 15);
        linkedList.print();
        linkedList.clear();
        linkedList.print();
    }
}
