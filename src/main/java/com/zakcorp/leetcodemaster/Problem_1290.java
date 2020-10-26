package com.zakcorp.leetcodemaster;

/**
 * Created by Zakir Hussain B on 26/10/20.
 *
 * @source:
 * @topic:
 * @sub-topic:
 * @platform:
 * @problem_link:
 * @pseudocode:
 */
public class Problem_1290 {
    static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    static class Solver {
        public int solve1(ListNode head) {
            StringBuilder sb = new StringBuilder();
            ListNode curr = head;
            while(curr != null) {
                sb.append(curr.val);
                curr = curr.next;
            }
            return Integer.parseInt(sb.toString(), 2);
        }
        public int solve2(ListNode head) {
            int ans = 0;
            while(head != null) {
                ans = (ans << 1) | head.val;
                head = head.next;
            }
            return ans;
        }
    }
}