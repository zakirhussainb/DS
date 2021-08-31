package com.zakcorp.leetcodemaster;

import java.util.*;

/** Add Two Numbers II
 * Here in this problem the lists are not reversed.
 * For e.g. 7->2->4->3 + 5->6->4 => 7->8->0->7
*/
public class Problem_445 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static class Solver {
        public ListNode solve1(ListNode l1, ListNode l2) {
            // Find the length of both the lists
            int len1 = 0, len2 = 0;
            ListNode curr1 = l1, curr2 = l2;
            while(curr1 != null) {
                len1++;
                curr1 = curr1.next;
            }
            while(curr2 != null) {
                len2++;
                curr2 = curr2.next;
            }

            // Initialize the current pointers back to their initial positions
            curr1 = l1;
            curr2 = l2;

            /*
            Parse both the lists and sum the corresponding positions
            without taking carry into account
             */
            ListNode head = null;
            while(len1 > 0 && len2 > 0) {
                int sum = 0;
                if(len1 >= len2) {
                    sum += curr1.val;
                    len1--;
                    curr1 = curr1.next;
                }
                if(len1 < len2) {
                    sum += curr2.val;
                    len2--;
                    curr2 = curr2.next;
                }
                // Update the result: add to front
                ListNode temp = new ListNode(sum);
                temp.next = head;
                head = temp;
            }

            /*
            Take the carry into account
            to have all elements to be less than 10
             */

            curr1 = head;
            head = null;
            int carry = 0;
            while(curr1 != null || carry > 0) {
                // current sum and carry
                int sum = carry;
                if(curr1 != null) {
                    sum += curr1.val;
                    curr1 = curr1.next;
                }
                ListNode temp = new ListNode(sum % 10);
                temp.next = head;
                head = temp;
                carry = sum / 10;
            }
            return head;
        }
    }
}
