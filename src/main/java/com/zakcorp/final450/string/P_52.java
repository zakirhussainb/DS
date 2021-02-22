package com.zakcorp.final450.string;

public class P_52 {
    // This solution assumes that there is no common character between "first" and "second" strings
    // It wont work if they have common characters in between them.
    static class Solver {
        public boolean solve1(String first, String second, String input) {
            int x = first.length(), y = second.length(), z = input.length();
            if(x + y != z) {
                return false;
            }
            int i = 0, j = 0, k = 0;
            while(k < z) {
                if(i < x && first.charAt(i) == input.charAt(k)) {
                    i++;
                } else if(j < y && second.charAt(j) == input.charAt(k)) {
                    j++;
                } else {
                    return false;
                }
                k++;
            }
            return i >= x && j >= y;
        }

    }
}
