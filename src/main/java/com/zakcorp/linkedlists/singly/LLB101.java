package com.zakcorp.linkedlists.singly;

public class LLB101 {
    Node head;
    class Node {
        Node next;
        int element;
        private Node(int element) {
            this.element = element;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // int[] arr = {1, 2, 3, 4, 5};
        LLB101 linkedList = new LLB101();
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addAfter(4, 50);
        linkedList.printLinkedList();
        System.out.println("count..." + linkedList.countNodes());
        System.out.println("countR..." + linkedList.countUsingRec());
        System.out.println("count..." + linkedList.countNodes());
        linkedList.printLinkedList();
        System.out.println("countR..." + linkedList.countUsingRec());
        System.out.println("sum..." + linkedList.findSum());
        System.out.println("sumUsingRec..." + linkedList.findSumRec(linkedList.head));
        System.out.println("Maximum element is...." + linkedList.findMax());
        System.out.println("Maximum element Using Recur is...." + linkedList.findMaxUsingRec(linkedList.head));
        System.out.println("Minimum element is...." + linkedList.findMin());
        System.out.println("Minimum element Using Recur is...." + linkedList.findMinUsingRec(linkedList.head));
        linkedList.printLinkedList();
        linkedList.insertInSortedSLL(25);
        linkedList.printLinkedList();
        linkedList.deleteByPosition(3);
        linkedList.printLinkedList();
        linkedList.deleteByElement(40);
        linkedList.printLinkedList();
//        linkedList.clear();
        linkedList.reverse();
        linkedList.printLinkedList();
        // linkedList.printLinkedListUsingRecursion(linkedList.head);
    }

    private void reverse() {
        if(head == null)
            return;
        Node p = head;
        while(p != null) {
            p = p.next;
        }

    }

    private void clear() {
        head = null;
    }

    private void deleteByElement(int data) {
        if(head == null)
            return;
        Node p = head;
        int pos = 0;
        while(p != null) {
            if(p.element > data) {
                deleteByPosition(pos - 1);
            }
            pos++;
            p = p.next;
        }
    }

    private void deleteByPosition(int pos) {
        if(head == null)
            return;
        Node p =head;
        if(pos == 0)
            head = p.next;
        for(int i = 0; p != null && i < pos - 1; i++) {
            p = p.next;
        }
        if(p == null || p.next == null)
            return;
        p.next = p.next.next;
    }

    private void insertInSortedSLL(int data) {
        Node p = head;
        int pos = 0;
        while(p != null) {
            pos++;
            if(data < p.element) {
                addAfter(pos - 1, data);
                break;
            }
            p = p.next;
        }
    }

    private int findMinUsingRec(Node p) {
        if(p != null) {
            return Math.min(p.element, findMinUsingRec(p.next));
        }
        return Integer.MAX_VALUE;
    }

    private int findMin() {
        Node p = head;
        int min = Integer.MAX_VALUE;
        while(p != null) {
            min = Math.min(p.element, min);
            p = p.next;
        }
        return min;
    }

    private int findMaxUsingRec(Node p) {
        if(p != null){
            return Math.max(p.element, findMaxUsingRec(p.next));
        }
        return Integer.MIN_VALUE;
    }

    private int findMax() {
        int max = Integer.MIN_VALUE;
        Node p = head;
        while(p != null) {
            max = Math.max(p.element, max);
            p = p.next;
        }
        return max;
    }

    private int findSumRec(Node p) {
        if(p != null) {
            return findSumRec(p.next) + p.element;
        }
        return 0;
    }

    private int findSum() {
        int sum = 0;
        Node p = head;
        while(p != null) {
            sum = sum + p.element;
            p = p. next;
        }
        return sum;
    }

    private int countNodes() {
        int count = 0;
        Node p = head;
        while(p != null){
            count++;
            p = p.next;
        }
        return count;
    }
    private int countUsingRec() {
        Node p = head;
        return countNodesUsingRecursion(p);
    }
    private int countNodesUsingRecursion(Node p) {
        if(p != null) {
            return countNodesUsingRecursion(p.next) + 1;
        }
        return 0;
    }

    private void addAfter(int pos, int element) {
        Node t = new Node(element);
        Node p = head;
        for(int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        t.next = p.next;
        p.next = t;
    }

    private void addLast(int element) {
        Node t = new Node(element);
        t.next = null;
        if(head == null){
            head = new Node(element);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = t;
    }

    private void addFirst(int element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
    }

    private void printLinkedList() {
        if(head == null)
            System.out.println("***List is Empty***");
        Node p = head;
        while(p != null) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }

    private void printLinkedListUsingRecursion(Node node) {
        if(node != null) {
            System.out.print(node.element + " ");
            printLinkedListUsingRecursion(node.next);
        }
    }
}
