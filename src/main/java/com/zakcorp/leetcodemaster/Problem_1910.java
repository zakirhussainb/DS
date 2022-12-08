package com.zakcorp.leetcodemaster;

public class Problem_1910
{
    static class Solver {
        public String solve1(String str, String part) {
            StringBuilder sb = new StringBuilder(str);
            recursive(sb, part);
            return sb.toString();
        }
        private void recursive(StringBuilder sb, String part) {
            if (sb.indexOf( part ) < 0) {
                return;
            }
            int x = sb.indexOf( part );
            sb.delete( x, x + part.length() );
            recursive( sb, part );
        }
    }
}
