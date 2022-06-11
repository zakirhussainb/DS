package com.zakcorp.leetcodemaster;

public class Problem_2299 {
    static class Solver {
        public boolean solve1(String password) {
            String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[!@#$%^&*()\\-+]).{8,}$";
            boolean matches = java.util.regex.Pattern.matches(regex, password);
            if(matches) {
                for(int i = 1; i < password.length(); i++) {
                    if(password.charAt(i - 1) == password.charAt(i)) {
                        return false;
                    }
                }
            } else {
                return false;
            }
            return true;
        }
        public boolean solve2(String password) {
            if(password.length() < 8) {
                return false;
            }
            boolean isLower = false, isUpper = false, isDigit = false, isSpecial = false;
            for(char ch : password.toCharArray()) {
                if(ch >= 'a' && ch <= 'z') {
                    isLower = true;
                }
                if(ch >= 'A' && ch <= 'Z') {
                    isUpper = true;
                }
                if(ch >= '0' && ch <= '9') {
                    isDigit = true;
                }
                if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') {
                    isSpecial = true;
                }
            }
            if( !isLower || !isUpper || !isDigit || !isSpecial ) {
                return false;
            }
            for(int i = 1; i < password.length(); i++) {
                if(password.charAt(i - 1) == password.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
