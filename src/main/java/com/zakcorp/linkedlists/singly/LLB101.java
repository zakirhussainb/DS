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
//        LLB101 linkedList = new LLB101();
        LLB101 linkedList1 = new LLB101();
        LLB101 linkedList2 = new LLB101();
        linkedList1.add(35);
        linkedList1.add(36);
        linkedList1.add(37);
        linkedList1.add(38);

        linkedList2.add(25);
        linkedList2.add(26);
        linkedList2.add(27);
        linkedList2.add(28);
        /*linkedList.add(10);
        linkedList.add(15);
        linkedList.print();
        linkedList.add(20);
        linkedList.add(40);
        linkedList.print();
        linkedList.addFirst(5);
        linkedList.print();
        linkedList.add(3, 18);
        linkedList.print();
        System.out.println("Count Nodes...." + linkedList.count());
        System.out.println("Count Nodes Rec...." + linkedList.count(linkedList.head));
        System.out.println("Sum of elements...." + linkedList.sum());
        System.out.println("Sum of Elements Rec...." + linkedList.sum(linkedList.head));
        System.out.println("Max element is...." + linkedList.getMax());
        System.out.println("Max element is Rec...." + linkedList.getMax(linkedList.head));
        linkedList.insertInSorted(25);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();
        linkedList.reverseRec(null, linkedList.head);
        linkedList.print();*/
//        linkedList.concat(linkedList1, linkedList2);
//        linkedList.printCustom(linkedList1.head);
        linkedList1.head = new LLB101().mergeTwoLL(linkedList1.head, linkedList2.head);
        linkedList1.printCustom(linkedList1.head);

    }

    private Node mergeTwoLL(Node headA, Node headB) {
        Node p = new Node(0);
        Node tail = p;
        while(true){
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            if(headA.element <= headB.element) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return p.next;
    }

    public void printCustom(Node head) {
        if(head == null) {
            System.out.println("List is empty....");
        }
        Node p = head;
        while(p != null) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }

    public void concat(LLB101 ll1, LLB101 ll2) {
        Node p = ll1.head;
        while(p.next != null) {
            p = p.next;
        }
        p.next = ll2.head;
        ll2.head = null;
    }

    public void reverseRec(Node q, Node p) {
        if(p != null){
            reverseRec(p, p.next);
            p.next = q;
        } else {
            head = q;
        }
    }

    public void reverse() {
        Node r = null;
        Node q = null;
        Node p = head;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
    }

    public void insertInSorted(int data) {
        if(head == null){
            head = new Node(data);
            return;
        }
        Node p = head;
        int pos = 0;
        while(p != null){
            if(p.element > data){
                add(pos, data);
            }
            p = p.next;
            pos++;
        }
    }

    public int getMax(Node p) {
        if(p != null){
            return Math.max(p.element, getMax(p.next));
        }
        return Integer.MIN_VALUE;
    }
    public int getMax() {
        Node p = head;
        int max = Integer.MIN_VALUE;
        while(p != null) {
            max = Math.max(max, p.element);
            p = p.next;
        }
        return max;
    }

    public int sum() {
        if(head == null) {
            return -1;
        }
        Node p = head;
        int sum = 0;
        while(p != null) {
            sum = sum + p.element;
            p = p.next;
        }
        return sum;
    }

    public int sum(Node p) {
        if(p != null) {
            return sum(p.next) + p.element;
        }
        return 0;
    }
    public int count() {
        if(head == null) {
            return 0;
        }
        Node p = head;
        int sum = 0;
        while(p != null) {
            p = p.next;
            sum++;
        }
        return sum;
    }

    public int count(Node p){
        if(p != null) {
            return count(p.next) + 1;
        }
        return 0;
    }

    public void add(int data) {
        addLast(data);
    }

    public void addLast(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node t = new Node(data);
        t.next = null;
        Node p = head;
        while(p.next != null) {
            p = p.next;
        }
        p.next = t;
    }
    public void addFirst(int data) {
        if(head == null){
            head = new Node(data);
            return;
        }
        Node t = new Node(data);
        t.next = head;
        head = t;
    }
    public void add(int pos, int data) {
        if(head == null){
            head = new Node(data);
            return;
        }
        Node p = head;
        for(int i = 0; i < pos - 1; i++) {
            p = p.next;
        }
        Node t = new Node(data);
        t.next = p.next;
        p.next = t;
    }
    public void print() {
        if(head == null) {
            System.out.println("List is empty...");
        }
        Node p = head;
        while(p != null) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }
}
