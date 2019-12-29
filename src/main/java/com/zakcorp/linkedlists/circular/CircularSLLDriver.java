package com.zakcorp.linkedlists.circular;

public class CircularSLLDriver {
    public static void main(String[] args) {
        CircularSLLProblems csllProblems = new CircularSLLProblems();
        CircularSLLImpl csll = new CircularSLLImpl();
        csll.add(99);
        csll.add(11);
        csll.add(22);
        csll.add(33);
        csll.add(44);
        csll.add(55);
        csll.add(66);
        csll.printListCustom(csll.head);
        csll.add(2, 25);
        csll.printListCustom(csll.head);
        csll.removeByElement(5);
        csll.printListCustom(csll.head);
        CircularSLLImpl.Node head = csllProblems.exchangeFirstAndLastNodes(csll.head);
        csll.printListCustom(head);

        int[] arr = csllProblems.sumAndProduct(csll.head, 5);
        System.out.println("sum..."+ arr[0]);
        System.out.println("product..."+ arr[1]);

        /* true:- Deletes all even position nodes
         *  false:- Deletes all odd position nodes
         * Note:- 1-based indexing*/
//        CircularSLLImpl.Node head = csllProblems.deleteNode(csll.head, true);
//        csll.printListCustom(head);

//        int[] arr = csllProblems.getMinAndMax(csll.head);
//        System.out.println("Min..." + arr[0]);
//        System.out.println("Max..." + arr[1]);

//        CircularSLLImpl.Node head = csllProblems.deleteAllPrimeNodes(csll.head);
//        csll.printListCustom(head);
    }
}
