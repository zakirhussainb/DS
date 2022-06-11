package com.zakcorp.leetcodemaster.contest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_A {
    static class Solver {
        public boolean solve1(String password) {
//            String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])$";
//            boolean matches = false;
//            if(password.length() >= 8) {
//                matches = true;
//            }
//            if(password.matches("!@#\\$%\\^&\\*\\(\\)-\\+")) {
//
//            }
//
//            boolean matches = Pattern.matches(regex, password);
//
//            if(matches) {
//                for(int i = 1; i < password.length(); i++) {
//                    if(password.charAt(i - 1) == password.charAt(i)) {
//                        return false;
//                    }
//                }
//            } else {
//                return false;
//            }
//            return true;
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
    }
}
