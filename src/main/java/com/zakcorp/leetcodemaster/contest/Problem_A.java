package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        public boolean solve1(int[] arr) {
            return canJump(0, arr);
        }
        private boolean canJump(int index, int[] arr) {
            if(index == arr.length - 1)
                return true;
            for(int i = index; i < index + arr[index]; i++) {
                if(canJump(i + 1, arr))
                    return true;
            }
            return false;
        }
    }
}
