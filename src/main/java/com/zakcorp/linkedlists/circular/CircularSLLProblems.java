package com.zakcorp.linkedlists.circular;

public class CircularSLLProblems {
    public static void main(String[] args) {
        CircularSLLImpl csll = new CircularSLLImpl();
        csll.add(99);
        csll.add(11);
        csll.add(22);
        csll.add(33);
        csll.add(44);
        csll.add(55);
        csll.add(66);
        csll.printListCustom(csll.head);
//        csll.add(2, 25);
//        csll.printListCustom(csll.head);
//        csll.removeByElement(5);
//        csll.printListCustom(csll.head);
//        CircularSLLImpl.Node head = exchangeFirstAndLastNodes(csll.head);
//        csll.printListCustom(head);

        /*int[] arr = sumAndProduct(csll.head, 5);
        System.out.println("sum..."+ arr[0]);
        System.out.println("product..."+ arr[1]);*/

        /* true:- Deletes all even position nodes
        *  false:- Deletes all odd position nodes
        * Note:- 1-based indexing*/
//        CircularSLLImpl.Node head = deleteNode(csll.head, true);
//        csll.printListCustom(head);

        int[] arr = getMinAndMax(csll.head);
        System.out.println("Min..." + arr[0]);
        System.out.println("Max..." + arr[1]);

//        CircularSLLImpl.Node head = deleteAllPrimeNodes(csll.head);
//        csll.printListCustom(head);
    }

    private static CircularSLLImpl.Node deleteAllPrimeNodes(CircularSLLImpl.Node head) {
//        CircularSLLImpl.Node prev = null;
//        CircularSLLImpl.Node curr = head;
//        do{
//            if(curr.data )
//        }while (curr != head);
        return null;
    }

    private static int[] getMinAndMax(CircularSLLImpl.Node head) {
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

    private static CircularSLLImpl.Node deleteNode(CircularSLLImpl.Node head, boolean position){
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

    private static int[] sumAndProduct(CircularSLLImpl.Node head, int k) {
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
//    public static CircularSLLImpl.Node exchangeFirstAndLastNodes(CircularSLLImpl.Node head){
//        int headData = head.data;
//
//        int tailData = CircularSLLImpl.tail
//    }
}
