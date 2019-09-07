package com.zakcorp.linkedlists.singly;

public class SLL020 {
    public static void main(String[] args) {
        LinkedList101<Integer> linkedList = new LinkedList101<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(10);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.print();
        linkedList.removeDuplicates();
        linkedList.print();
//        linkedList.print();
    }
}
