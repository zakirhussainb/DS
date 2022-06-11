package com.zakcorp.leetcodemaster.util;

import com.zakcorp.leetcodemaster.classes.ListNode;

public class CommonUtility {
    public boolean areListsSame(ListNode l1, ListNode l2) {
        while(l1 != null && l2 != null) {
            if(l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}
