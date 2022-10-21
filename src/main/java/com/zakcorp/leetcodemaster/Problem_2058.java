package com.zakcorp.leetcodemaster;

import com.zakcorp.leetcodemaster.classes.ListNode;

public class Problem_2058 {
    static class Solver {
        public int[] solve1(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            int pos = 1;
            int minDist = Integer.MAX_VALUE;
            int currPos = 0;
            int firstPos = Integer.MAX_VALUE;
            int lastPos = Integer.MIN_VALUE;
            while(curr.next != null) {
                if(prev != null) {
                    if( (curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val) ) {
                        firstPos = Math.min(firstPos, pos);
                        lastPos = Math.max(lastPos, pos);
                        if(currPos != 0) {
                            minDist = Math.min(minDist, pos - currPos);
                        }
                        currPos = pos;
                    }
                }
                prev = curr;
                curr = curr.next;
                pos++;
            }
            if(minDist == Integer.MAX_VALUE || lastPos == Integer.MIN_VALUE || firstPos == Integer.MAX_VALUE) {
                return new int[]{-1, -1};
            }
            return new int[]{minDist, lastPos - firstPos};
        }
    }
}
