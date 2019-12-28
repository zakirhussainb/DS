package com.zakcorp.linkedlists.singly;

import java.util.*;

public class GFG_All_Problems {
    public static void main(String[] args) {
        SLinkedListInteger sll = new SLinkedListInteger();
        sll.add(5);
        sll.add(20);
        sll.add(4);
        sll.add(3);
        sll.add(30);
//        sll.add(49);
//        sll.add(53);
//        sll.add(53);
//        sll.printListCustom(sll.head);
//        SLinkedList.Node<Integer> head = makeMiddlePointToHead(sll.head);
//        sll.printCustom(head);
//        SLinkedList.Node<Integer> head1 = rotateLLBlockWise(sll.head, 3, 1);
//        sll.printCustom(head1);

//        SLinkedListInteger.Node head = rotateLinkedList(sll.head, 3);
//        sll.printListCustom(head);
//        SLinkedListInteger.Node head = sortZeroOneTwo(sll.head);
//        sll.printListCustom(head);
        /*SLinkedListInteger sllCp1 = new SLinkedListInteger();
        sllCp1.add(4);
        sllCp1.add(3);
        sllCp1.add(5);
        sllCp1.add(7);
        sllCp1.add(11);
        sllCp1.add(2);
        sllCp1.add(1);
        SLinkedListInteger sllCp2 = new SLinkedListInteger();
        sllCp2.add(2);
        sllCp2.add(3);
        sllCp2.add(4);
        sllCp2.add(5);
        sllCp2.add(6);
        sllCp2.add(8);
        sllCp2.add(12);
        int x = 9;
        int pairCount = countPairsSumEqual(sllCp1.head, sllCp2.head, x);
        System.out.println("Number of Pairs from two linked lists whose sum is equal to...." + pairCount);*/

//        SLinkedListInteger.Node head = removeEveryKthNode(sll.head, 4);
//        sll.printListCustom(head);

//        SLinkedListInteger.Node head = removeAllDuplicatesFromSortedList(sll.head);
//        sll.printListCustom(head);

//        SLinkedListInteger.Node head = moveAllOccurrencesToEnd(sll.head, 2);
//        sll.printListCustom(head);

        /*HashSet<HashSet<Integer>> twoDList= findPairForGivenSum_70(sll.head, 17);
        for(HashSet<Integer> l1 : twoDList){
            for(Integer i : l1){
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

//        SLinkedListInteger.Node head = partitionLL_71(sll.head, 3);
//        sll.printListCustom(head);

        /* Check linked list with a loop is palindrome or not */
        /*SLinkedListInteger.Node head = new SLinkedListInteger.Node(1);
        head.next = new SLinkedListInteger.Node(2);
        head.next.next = new SLinkedListInteger.Node(3);
        head.next.next.next = new SLinkedListInteger.Node(2);
        head.next.next.next.next = new SLinkedListInteger.Node(1);

        *//*Creating a loop for testing purpose*//*
        head.next.next.next.next = head.next;

        if(isPalindrome_72(head)){
            System.out.println("Paindrome");
        } else {
            System.out.println("Not a palindrome");
        }*/

//        SLinkedListInteger.Node head = problem_59_1(sll.head);
//        sll.printNextArbitPointers(head);

//        SLinkedListInteger.Node head = problem_59_2(sll.head);
//        sll.printNextArbitPointers(head);


//        SLinkedListInteger.Node head = problem_58(sll.head);
//        sll.printListCustom(head);

        int result = problem_54(sll.head);
        System.out.println("Randomly selected Key is..." + result);


    }

    private static int problem_54(SLinkedListInteger.Node head) {
        int length = 5;
        Random random = new Random();
        int res = random.nextInt(length);
        int result = -1;
        if(head == null){
            return result;
        }
        result = head.data;
        SLinkedListInteger.Node curr = head;
        int n = 2;
        while(curr != null){
            if(Math.random() % n == 0){
                result = curr.data;
            }
            n++;
            curr = curr.next;
        }
        return result;
    }

    private static SLinkedListInteger.Node problem_58(SLinkedListInteger.Node head) {
        if(head == null)
            return head;
        SLinkedListInteger.Node curr = reverseList(head);
        SLinkedListInteger.Node pHead = curr;
        pHead.data = pHead.data + 1;
//        SLinkedListInteger.Node nPtr = pHead.next;
        while (pHead != null){
            if(pHead.data > 9){
                pHead.data = 0;
                if(pHead.next != null){
                    pHead.next.data = pHead.next.data + 1;
                } else {
                    pHead.next = new SLinkedListInteger.Node(1);
                }
            }
            pHead = pHead.next;
        }
        return reverseList(curr);
    }

    private static SLinkedListInteger.Node problem_59_2(SLinkedListInteger.Node head) {
        head = reverseList(head);
        SLinkedListInteger.Node max = head;
        SLinkedListInteger.Node temp = head.next;
        while(temp != null){
//            temp.arbit = max;
            if(max.data < temp.data) {
                max = temp;
            }
            temp = temp.next;
        }
        return reverseList(head);
    }

    private static SLinkedListInteger.Node reverseList(SLinkedListInteger.Node head) {
        SLinkedListInteger.Node p = head;
        SLinkedListInteger.Node q = null;
        SLinkedListInteger.Node r = null;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }

    private static SLinkedListInteger.Node problem_59_1(SLinkedListInteger.Node head) {
        SLinkedListInteger.Node otrNode = head;
        while(otrNode != null){
            SLinkedListInteger.Node inrNode  = otrNode.next;
            SLinkedListInteger.Node prev = null;
            while(inrNode != null){
                if(otrNode.data < inrNode.data){
//                    otrNode.arbit = inrNode;
                    break;
                } else {
                    prev = inrNode;
                    inrNode = inrNode.next;
                }
            }
            if(inrNode == null && prev != null){
//                otrNode.arbit = prev;
            }
            otrNode = otrNode.next;
        }
        return head;
    }

    private static boolean isPalindrome_72(SLinkedListInteger.Node head) {
        SLinkedListInteger.Node slow = head;
        SLinkedListInteger.Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }
        }
        slow = head;

        while(slow != null){
            slow = slow.next;

            fast = fast.next;
            if(slow == fast){
                break;
            }
        }
        //System.out.println(prev.data);
        SLinkedListInteger.Node tempHead = slow;
        SLinkedListInteger.Node curr = tempHead;
        do
        {
            System.out.println(curr.data);
            curr = curr.next;
        }while(tempHead != curr);
        System.out.println(curr.next.data);
        return true;
    }

    private static SLinkedListInteger.Node partitionLL_71(SLinkedListInteger.Node head, int x) {
        SLinkedListInteger.Node smallHead = null, smallLast = null,
                equalHead = null, equalLast = null, greaterHead = null,
                greaterLast = null;
        while(head != null){
            if(head.data == x){
                if(equalHead == null){
                    equalHead = equalLast = head;
                } else {
                    equalLast.next = head;
                    equalLast = head;
                }
            } else if(head.data < x){
                if(smallHead == null){
                    smallHead = smallLast = head;
                } else {
                    smallLast.next = head;
                    smallLast = head;
                }
            } else {
                if(greaterHead == null){
                    greaterLast = greaterHead = head;
                } else {
                    greaterLast.next = head;
                    greaterLast = head;
                }
            }
            head = head.next;
        }

        if(greaterLast != null){
            greaterLast.next = null;
        }
        if(smallHead == null){
            if(equalHead == null){
                return greaterHead;
            }
            equalLast.next = greaterHead;
            return equalHead;
        }
        if(equalHead == null){
            smallLast.next = greaterHead;
            return smallHead;
        }
        smallLast.next = equalHead;
        equalLast.next = greaterHead;
        return smallHead;
    }

    private static HashSet<HashSet<Integer>> findPairForGivenSum_70(SLinkedListInteger.Node head, int x) {
        HashSet<HashSet<Integer>> twoDList = new HashSet<>();
        HashSet<Integer> hSet = new HashSet<>();
        SLinkedListInteger.Node curr = head;
        while(curr != null){
            hSet.add(curr.data);
            curr = curr.next;
        }
        curr = head;

        while(curr != null){
            int sub = x - curr.data;
            HashSet<Integer> hSet1 = new HashSet<>();
            if(hSet.contains(sub)){
                hSet1.add(curr.data);
                hSet1.add(sub);
            }
            twoDList.add(hSet1);
            curr = curr.next;
        }
        return twoDList;
    }

    private static SLinkedListInteger.Node moveAllOccurrencesToEnd(SLinkedListInteger.Node head, int k) {
        SLinkedListInteger.Node curr = head;
        SLinkedListInteger.Node last = head;
        SLinkedListInteger.Node prev = null;
        while(last.next != null){
            last = last.next;
        }
        int lastData = last.data;
        while(curr != null){
            if(lastData == curr.data){
                return head;
            }
            if(curr.data == k){
                last.next = curr;
                last = curr;
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }

    private static SLinkedListInteger.Node removeAllDuplicatesFromSortedList(SLinkedListInteger.Node head) {
        // Not Understood this program
        SLinkedListInteger.Node dummy = new SLinkedListInteger.Node(0);
        dummy.next = head;
        SLinkedListInteger.Node prev = dummy;
        SLinkedListInteger.Node curr = head;
        while(curr != null){
            while(curr.next != null && (prev.next.data == curr.next.data) ){
                curr = curr.next;
            }
            if(prev.next == curr) {
                prev = prev.next;
            } else {
                prev.next = curr.next;
            }
            curr = curr.next;
        }
        return head;
    }

    private static SLinkedListInteger.Node removeEveryKthNode(SLinkedListInteger.Node head, int k) {
        SLinkedListInteger.Node prev = null;
        SLinkedListInteger.Node curr = head;
        int i = 1;
        while(curr != null){
            if(i == k){
                if(prev == null){
                    curr = curr.next;
                    head = curr;
                    continue;
                } else {
                    prev.next = curr.next;
                    curr = curr.next;
                    prev = null;
                    i = 1;
                    continue;
                }
            }
            i++;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }

    private static int countPairsSumEqual(SLinkedListInteger.Node head1, SLinkedListInteger.Node head2, int x) {
        HashSet<Integer> hSet = new HashSet<>();
        SLinkedListInteger.Node curr = head1;
        while(curr != null){
            hSet.add(curr.data);
            curr = curr.next;
        }

        curr = head2;
        int counter = 0;
        while(curr != null){
            if(hSet.contains(x - curr.data)){
                counter++;
            }
            curr = curr.next;
        }
        return counter;
    }

    private static SLinkedListInteger.Node sortZeroOneTwo(SLinkedListInteger.Node head) {
        SLinkedListInteger.Node curr = head;
        int[] count = {0, 0, 0};
        while(curr != null){
            count[curr.data]++;
            curr = curr.next;
        }
        int i = 0;
        curr = head;
        while (curr != null)
        {
            if (count[i] == 0)
                i++;
            else
            {
                curr.data= i;
                --count[i];
                curr = curr.next;
            }
        }
        return head;
    }

    private static SLinkedListInteger.Node rotateLinkedList(SLinkedListInteger.Node head, int key) {
        SLinkedListInteger.Node curr = head;
        SLinkedListInteger.Node kthNode = null;
        int i = 1;
        while(curr.next != null){
            if(i == key){
                kthNode = curr;
            }
            i++;
            curr = curr.next;
        }
        if(kthNode == null){
            return head;
        }
        SLinkedListInteger.Node lastNode = curr;
        lastNode.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }

    private static SLinkedList.Node<Integer> rotateLLBlockWise(SLinkedList.Node<Integer> head, int k, int d){
        SLinkedList.Node<Integer> prev = null;
        if(d == 1){
            recurRotate(prev, head, k);
        }
        return head;
    }

    private static void recurRotate(SLinkedList.Node<Integer> prev, SLinkedList.Node<Integer> head, int k){
//        if(prev == null || head == null){
//            return;
//        }
        SLinkedList.Node<Integer> curr = head;
        SLinkedList.Node<Integer> prev1 = null;
        for(int i = 1; i < k; i++){
            i++;
            prev1 = curr;
            curr = curr.next;
        }
        if(prev == null){
            curr.next = head;
            head = curr;
        }
    }

    private static SLinkedList.Node<Integer> makeMiddlePointToHead(SLinkedList.Node<Integer> head){
        SLinkedList.Node<Integer> fast = head;
        SLinkedList.Node<Integer> slow = head;
        SLinkedList.Node<Integer> prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = slow.next;
        slow.next = head;
        head = slow;
        return head;
    }
}
