package com.zakcorp.leetcodemaster;
import java.util.*;

public class Problem_844 {
    static class Solver {
        public boolean backspaceCompare(String S, String T) {
//            return construct(S).equals(construct(T));
            return stringBuild(S).equals(stringBuild(T));
        }

        private String stringBuild(String str) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '#') {
                    if(sb.length() != 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else {
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }

        private String construct(String str) {
            Stack<Character> stack = new Stack<>();
            for(Character c : str.toCharArray()) {
                if(c != '#'){
                    stack.push(c);
                } else if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            return String.valueOf(stack);
        }
    }
}
