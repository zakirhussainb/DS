package com.zakcorp.linkedlists.circular;

public class CircularSLLProblems {

    protected CircularSLLImpl.Node deleteAllPrimeNodes(CircularSLLImpl.Node head) {
//        CircularSLLImpl.Node prev = null;
//        CircularSLLImpl.Node curr = head;
//        do{
//            if(curr.data )
//        }while (curr != head);
        return null;
    }

    protected int[] getMinAndMax(CircularSLLImpl.Node head) {
        int[] resultArr = new int[2];
        CircularSLLImpl.Node curr = head;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        do{
            min = Math.min(curr.data, min);
            max = Math.max(curr.data, max);
            curr = curr.next;
        }while (curr != head);
        resultArr[0] = min;
        resultArr[1] = max;
        return resultArr;
    }

    protected CircularSLLImpl.Node deleteNode(CircularSLLImpl.Node head, boolean position){
        CircularSLLImpl.Node curr = position ? head : head.next;
        CircularSLLImpl.Node prev;
        do{
            prev = curr;
            curr = curr.next.next;
            prev.next = curr;
        }while(curr.next != head && curr.next.next != head);
        curr.next = head;
        head = position ? head : head.next;
        return head;
    }

    protected int[] sumAndProduct(CircularSLLImpl.Node head, int k) {
        int[] arr = new int[2];
        CircularSLLImpl.Node curr = head;
        int sum = 0;
        int product = 1;
        do{
            if(curr.data % k == 0){
                sum = sum + curr.data;
                product = product * curr.data;
            }
            curr = curr.next;
        }while(curr != head);
        arr[0] = sum;
        arr[1] = product;
        return arr;
    }
    protected CircularSLLImpl.Node exchangeFirstAndLastNodes(CircularSLLImpl.Node head){
        int headData = head.data;

        return null;
    }
}
