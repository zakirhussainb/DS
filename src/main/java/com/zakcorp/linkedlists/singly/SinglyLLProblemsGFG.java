package com.zakcorp.linkedlists.singly;

import java.util.*;

public class SinglyLLProblemsGFG {

    protected int problem_54(SinglyLLIntImpl.Node head) {
        int length = 5;
        Random random = new Random();
        int res = random.nextInt(length);
        int result = -1;
        if(head == null){
            return result;
        }
        result = head.data;
        SinglyLLIntImpl.Node curr = head;
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

    protected SinglyLLIntImpl.Node problem_58(SinglyLLIntImpl.Node head) {
        if(head == null)
            return head;
        SinglyLLIntImpl.Node curr = reverseList(head);
        SinglyLLIntImpl.Node pHead = curr;
        pHead.data = pHead.data + 1;
//        SLinkedListInteger.Node nPtr = pHead.next;
        while (pHead != null){
            if(pHead.data > 9){
                pHead.data = 0;
                if(pHead.next != null){
                    pHead.next.data = pHead.next.data + 1;
                } else {
                    pHead.next = new SinglyLLIntImpl.Node(1);
                }
            }
            pHead = pHead.next;
        }
        return reverseList(curr);
    }

    protected SinglyLLIntImpl.Node problem_59_2(SinglyLLIntImpl.Node head) {
        head = reverseList(head);
        SinglyLLIntImpl.Node max = head;
        SinglyLLIntImpl.Node temp = head.next;
        while(temp != null){
//            temp.arbit = max;
            if(max.data < temp.data) {
                max = temp;
            }
            temp = temp.next;
        }
        return reverseList(head);
    }

    protected SinglyLLIntImpl.Node reverseList(SinglyLLIntImpl.Node head) {
        SinglyLLIntImpl.Node p = head;
        SinglyLLIntImpl.Node q = null;
        SinglyLLIntImpl.Node r = null;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
        return head;
    }

    protected SinglyLLIntImpl.Node problem_59_1(SinglyLLIntImpl.Node head) {
        SinglyLLIntImpl.Node otrNode = head;
        while(otrNode != null){
            SinglyLLIntImpl.Node inrNode  = otrNode.next;
            SinglyLLIntImpl.Node prev = null;
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

    protected boolean isPalindrome_72(SinglyLLIntImpl.Node head) {
        SinglyLLIntImpl.Node slow = head;
        SinglyLLIntImpl.Node fast = head;
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
        SinglyLLIntImpl.Node tempHead = slow;
        SinglyLLIntImpl.Node curr = tempHead;
        do
        {
            System.out.println(curr.data);
            curr = curr.next;
        }while(tempHead != curr);
        System.out.println(curr.next.data);
        return true;
    }

    protected SinglyLLIntImpl.Node partitionLL_71(SinglyLLIntImpl.Node head, int x) {
        SinglyLLIntImpl.Node smallHead = null, smallLast = null,
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

    protected HashSet<HashSet<Integer>> findPairForGivenSum_70(SinglyLLIntImpl.Node head, int x) {
        HashSet<HashSet<Integer>> twoDList = new HashSet<>();
        HashSet<Integer> hSet = new HashSet<>();
        SinglyLLIntImpl.Node curr = head;
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

    protected SinglyLLIntImpl.Node moveAllOccurrencesToEnd(SinglyLLIntImpl.Node head, int k) {
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node last = head;
        SinglyLLIntImpl.Node prev = null;
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

    protected SinglyLLIntImpl.Node removeAllDuplicatesFromSortedList(SinglyLLIntImpl.Node head) {
        // Not Understood this program
        SinglyLLIntImpl.Node dummy = new SinglyLLIntImpl.Node(0);
        dummy.next = head;
        SinglyLLIntImpl.Node prev = dummy;
        SinglyLLIntImpl.Node curr = head;
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

    protected SinglyLLIntImpl.Node removeEveryKthNode(SinglyLLIntImpl.Node head, int k) {
        SinglyLLIntImpl.Node prev = null;
        SinglyLLIntImpl.Node curr = head;
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

    protected int countPairsSumEqual(SinglyLLIntImpl.Node head1, SinglyLLIntImpl.Node head2, int x) {
        HashSet<Integer> hSet = new HashSet<>();
        SinglyLLIntImpl.Node curr = head1;
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

    protected SinglyLLIntImpl.Node sortZeroOneTwo(SinglyLLIntImpl.Node head) {
        SinglyLLIntImpl.Node curr = head;
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

    protected SinglyLLIntImpl.Node rotateLinkedList(SinglyLLIntImpl.Node head, int key) {
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node kthNode = null;
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
        SinglyLLIntImpl.Node lastNode = curr;
        lastNode.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }

    protected SinglyLLIntImpl.Node rotateLLBlockWise(SinglyLLIntImpl.Node head, int k, int d){
        SinglyLLIntImpl.Node prev = null;
        if(d == 1){
            recurRotate(prev, head, k);
        }
        return head;
    }

    protected void recurRotate(SinglyLLIntImpl.Node prev, SinglyLLIntImpl.Node head, int k){
//        if(prev == null || head == null){
//            return;
//        }
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node prev1 = null;
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

    protected SinglyLLIntImpl.Node makeMiddlePointToHead(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node fast = head;
        SinglyLLIntImpl.Node slow = head;
        SinglyLLIntImpl.Node prev = null;
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

    protected SinglyLLIntImpl.Node swapKthNodeFromBothEnds(SinglyLLIntImpl.Node head, int k) {
        /* https://www.geeksforgeeks.org/swap-kth-node-from-beginning-with-kth-node-from-end-in-a-linked-list/ */
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node prev = null;
        int i = 1;
        int l = getLength(head);
        SinglyLLIntImpl.Node firstPrev = null, first = null, secondPrev = null, second = null;
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
        SinglyLLIntImpl.Node temp = secondPrev.next;
        secondPrev.next = firstPrev.next;
        firstPrev.next = temp;
        return head;
    }

    protected int getLength(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node curr = head;
        int length = 0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        return length;
    }

    protected SinglyLLIntImpl.Node segregateZeroOneTwo(SinglyLLIntImpl.Node head) {
        int[] count = {0, 0, 0};
        SinglyLLIntImpl.Node curr = head;
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

    private SinglyLLIntImpl.Node mergeTwoLL(SinglyLLIntImpl.Node headA, SinglyLLIntImpl.Node headB) {
        SinglyLLIntImpl.Node p = new SinglyLLIntImpl.Node(0);
        SinglyLLIntImpl.Node tail = p;
        while(true){
            if(headA == null){
                tail.next = headB;
                break;
            }
            if(headB == null){
                tail.next = headA;
                break;
            }
            if(headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return p.next;

        /*
        * ListNode dummy = new ListNode(0);
        ListNode l3 = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if(l1 != null){
            l3.next = l1;
        }
        if(l2 != null){
            l3.next = l2;
        }
        return dummy.next;
        * */
    }
}
