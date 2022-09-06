package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1003
{
    static class Solver {
        public boolean solve1(String str) {
            if(str.isEmpty())
                return true;
            StringBuilder sb = new StringBuilder(str);
            while(sb.length() > 0) {
                if(sb.indexOf( "abc" ) >= 0) {
                    int start = sb.indexOf( "abc" );
                    sb.delete( start, start + 3 );
                } else {
                    return false;
                }
            }
            return true;
        }
        public boolean solve2(String str) {
            Stack<Character> stack = new Stack<>();
            for(char ch : str.toCharArray()) {
                if(ch == 'c') {
                    if(stack.isEmpty() || stack.pop() != 'b')
                        return false;
                    if(stack.isEmpty() || stack.pop() != 'a')
                        return false;
                } else {
                    stack.push( ch );
                }
            }
            return stack.isEmpty();
        }
    }
}
