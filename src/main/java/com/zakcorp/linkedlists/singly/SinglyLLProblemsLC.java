package com.zakcorp.linkedlists.singly;

public class SinglyLLProblemsLC {

    protected SinglyLLIntImpl.Node problem_92(SinglyLLIntImpl.Node head, int m, int n){
        /* https://leetcode.com/problems/reverse-linked-list-ii/ */
        if(head == null){
            return head;
        }
        SinglyLLIntImpl.Node curr = head;
        SinglyLLIntImpl.Node startBefore = null;
        SinglyLLIntImpl.Node endNext = null;
        SinglyLLIntImpl.Node start = null;
//        int size = 0;
        int i = 1;
        while(curr != null){
            if(i == m - 1){
                startBefore = curr;
            }
            if(i == m){
                start = curr;
            }
            if(i == n + 1){
                endNext = curr;
            }
            i++;
//            size++;
            curr = curr.next;
        }
//        System.out.println("size..." + size);
        SinglyLLIntImpl.Node startNode = null;
        if(startBefore == null || startBefore.next == null){
            startNode = start;
        } else {
            startNode = startBefore.next;
        }
        SinglyLLIntImpl.Node r = null;
        SinglyLLIntImpl.Node q = null;
        SinglyLLIntImpl.Node p = startNode;
        i = m;
        while(i <= n && p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
            i++;
        }
        /*for(i = m; i <= n; i++){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }*/
        if(startBefore == null || startBefore.next == null){
            if (endNext != null) {
                start.next = endNext;
            }
            return q;
        }
        startBefore.next = q;
        start.next = endNext;
        return head;
    }

    public int convertBinaryToInteger(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node curr = getReverseList(head);
        int num = 0, i = 0;
        while(curr != null){
            int value = curr.data * (int)Math.pow(2, i);
            num = num + value;
            curr = curr.next;
            i++;
        }
        return num;
    }

    public SinglyLLIntImpl.Node getReverseList(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node q = null;
        SinglyLLIntImpl.Node p = head;
        while(p != null){
            SinglyLLIntImpl.Node r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        return q;
    }

    public SinglyLLIntImpl.Node oddEvenList(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node odd = head;
        SinglyLLIntImpl.Node even = head.next;
        SinglyLLIntImpl.Node evenHead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public int[] nextLargerNodes(SinglyLLIntImpl.Node head){
        int lenOfList = getLengthOfList(head);
        int[] result = new int[lenOfList];
        int k = 0;
        SinglyLLIntImpl.Node p = head;
        while(p != null){
            SinglyLLIntImpl.Node q = p.next;
            while(q != null){
                if(p.data < q.data){
                    result[k++] = q.data;
                    break;
                }
                q = q.next;
            }
            if(q == null){
                result[k++] = 0;
            }
            p = p.next;
        }
        return result;
    }

    public int getLengthOfList(SinglyLLIntImpl.Node head){
        SinglyLLIntImpl.Node fast = head;
        int len = 1;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            len += 2;
        }
        if(fast == null){
            len = len - 1;
        }
        return len;
    }

    public SinglyLLIntImpl.Node addTwoNumbers(SinglyLLIntImpl.Node list1, SinglyLLIntImpl.Node list2){
        SinglyLLIntImpl.Node l1 = getReverseList(list1);
        SinglyLLIntImpl.Node l2 = getReverseList(list2);
        SinglyLLIntImpl.Node l3 = new SinglyLLIntImpl.Node(-1);
        SinglyLLIntImpl.Node result = l3;
        int sum = 0;
        while(l1 != null || l2 != null){
            sum = sum / 10;
            if(l1 != null){
                sum = sum + l1.data;
                l1 = l1.next;
            }
            if(l2 != null){
                sum = sum + l2.data;
                l2 = l2.next;
            }
            l3.next = new SinglyLLIntImpl.Node(sum % 10);
            l3 = l3.next;
        }
        if(sum / 10 > 0){
            l3.next = new SinglyLLIntImpl.Node(sum / 10);
        }
        return getReverseList(result.next);
    }


}
