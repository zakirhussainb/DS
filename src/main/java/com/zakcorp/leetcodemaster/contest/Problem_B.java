package com.zakcorp.leetcodemaster.contest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_B {
    static class Solver {
        private static final String regex = "\\$[0-9\\(\\)]+$";
        public String solve1(String sentence, int discount) {
            String[] split = sentence.split("\\s+");
            for(int i = 0; i < split.length; i++) {
                long count = split[i].chars().filter(ch -> ch == '$').count();
                if(count > 1) {
                    continue;
                }
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(split[i]);
                boolean matchFound = matcher.find();
                StringBuilder sb = new StringBuilder();
                if(matchFound) {
                    if(discount == 100) {
                        split[i] = "$0.00";
                    } else {
                        long num = Long.parseLong(split[i].substring(1));
                        double value = (double) num * (discount / 100.0);
                        value = num - value;
                        String r = String.format("%1$,.2f", value);
                        r = r.replaceAll(",", "");
                        sb.append("$");
                        sb.append(r);
                        split[i] = sb.toString();
                    }
                }
            }
            StringBuilder res = new StringBuilder();
            for(int i = 0; i < split.length; i++) {
                res.append(split[i]);
                res.append(" ");
            }
            res.deleteCharAt(res.length() - 1);
            return res.toString();
        }
    }
}
