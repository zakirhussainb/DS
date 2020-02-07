package com.zakcorp.linkedlists.singly;

public class SinglyLLIntImplTwoPointers {
    public Node head;
    public SinglyLLIntImplTwoPointers(){

    }
    public SinglyLLIntImplTwoPointers(Node head){
        this.head = head;
    }

    static class Node{
        int data;
        Node next;
        Node arbit;
        Node(int data){
            this.data = data;
            next = null;
            arbit = null;
        }
    }
    public void add(int data){
        addLast(data);
    }
    private void addLast(int data){
       if(head == null){
           head = new Node(data);
           return;
       }
       Node t = new Node(data);
       Node curr = head;
       while(curr.next != null){
           curr = curr.next;
       }
       curr.next = t;
       t.next = null;
    }
    private void printListCustom(Node head){
        if(head == null){
            System.out.println("LinkedList is Empty...");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void printNextArbitPointers(Node node) {
        System.out.println("Node\tNext Pointer\tArbit Pointer");
        while (node != null)
        {
            System.out.print(node.data + "\t\t");

            if (node.next != null)
                System.out.print(node.next.data + "\t\t");
            else
                System.out.print("NULL" +"\t\t");

            if (node.arbit != null)
                System.out.print(node.arbit.data);
            else
                System.out.print("NULL");

            System.out.println();
            node = node.next;
        }
    }
}
