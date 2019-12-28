package com.zakcorp.linkedlists.singly;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SinglyLLProblems {
    public static void main(String[] args) {
        SLinkedListInteger sll = new SLinkedListInteger();
        sll.add(2);
        sll.add(3);
        sll.add(4);
        sll.add(5);
        sll.add(6);
        sll.add(7);
        sll.add(8);
        sll.add(9);
        sll.printListCustom(sll.head);
        int k = 3;
//        SLinkedListInteger.Node head = rotateLinkedList(sll.head, k);
//        sll.printListCustom(head);

//        SLinkedListInteger.Node head = segregateZeroOneTwo(sll.head);
//        sll.printListCustom(head);

//        int[] arr = {1,2,2,1,2,0,2,2};
//        int[] result = segregateZeroOneTwo(arr);
//        System.out.println(Arrays.toString(result));

        SLinkedListInteger.Node head = swapKthNodeFromBothEnds(sll.head, 3);
        sll.printListCustom(head);

    }

    private static SLinkedListInteger.Node swapKthNodeFromBothEnds(SLinkedListInteger.Node head, int k) {
        /* https://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-end-in-a-linked-list/ */
        SLinkedListInteger.Node curr = head;
        SLinkedListInteger.Node prev = null;
        int i = 1;
        int l = getLength(head);
        SLinkedListInteger.Node firstPrev = null, first = null, secondPrev = null, second = null;
        while(curr != null){
            if(i == k){
                firstPrev = prev;
                first = curr;
            }
            if(l == k){
                secondPrev = prev;
                second = curr;
                break;
            }
            i++;
            l--;
            prev = curr;
            curr = curr.next;
        }
        SLinkedListInteger.Node temp = secondPrev.next;
        secondPrev.next = firstPrev.next;
        firstPrev.next = temp;
        return head;
    }

    private static int getLength(SLinkedListInteger.Node head){
        SLinkedListInteger.Node curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    private static int[] segregateZeroOneTwo(int[] arr){
        int[] count = {0,0,0};
        int n = arr.length;
        for (int value : arr) {
            count[value]++;
        }
        System.out.println(count);
        return count;
    }
    private static SLinkedListInteger.Node segregateZeroOneTwo(SLinkedListInteger.Node head) {
        int[] count = {0, 0, 0};
        SLinkedListInteger.Node curr = head;
        while(curr != null){
            count[curr.data]++;
            curr = curr.next;
        }
        int i = 0;
        curr = head;
        while(curr != null){
            if(count[i] == 0)
                i++;
            else {
                curr.data = i;
                --count[i];
                curr = curr.next;
            }
        }
        return head;
    }

    private static SLinkedListInteger.Node rotateLinkedList(SLinkedListInteger.Node head, int k){
        SLinkedListInteger.Node curr = head;
        SLinkedListInteger.Node lastNode = null;
        SLinkedListInteger.Node kthNode = null;
        int i = 1;
        while(curr.next != null){
            if(i == k){
                kthNode = curr;
            }
            i++;
            curr = curr.next;
        }
        if(kthNode == null){
            return head;
        }
        lastNode = curr;
        lastNode.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }
}
