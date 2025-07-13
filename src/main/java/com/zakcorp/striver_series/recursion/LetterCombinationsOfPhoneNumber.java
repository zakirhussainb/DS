package com.zakcorp.striver_series.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    static class Solver {
        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();
            String[] arr = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            lettercomb(0, digits, arr, "", res);
            return res;
        }
        private static void lettercomb(int ind, String digits, String[] arr, String ans, List<String> res) {
            if(ind == digits.length()) {
                res.add(ans);
                return;
            }
            int num = digits.charAt(ind) - '0';
            for(int i = 0; i < arr[num].length(); i++) {
                lettercomb(ind + 1, digits, arr, ans + arr[num].charAt(i), res);
            }
        }
    }
}
