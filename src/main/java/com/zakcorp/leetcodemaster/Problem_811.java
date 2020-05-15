package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_811 {
    static class Solver {
        public List<String> subdomainVisits(String[] cpdomains) {
            List<String> list = new ArrayList<>();
            int n = cpdomains.length;
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                String[] splitStr = cpdomains[i].split("\\s+");
                int countDomain = Integer.parseInt(splitStr[0]);
                String[] cpDomain = splitStr[1].split("\\.");
                int m = cpDomain.length;
                String cp = "";
                for(int j = m - 1; j >= 0; j--) {
                    if(!cp.isEmpty()) {
                        cp = cpDomain[j] + "." + cp;
                    } else {
                        cp = cpDomain[j];
                    }
                    map.put(cp, countDomain + (map.getOrDefault(cp, 0)));
                }
            }
            map.forEach( (key, value) -> {
                String result = value + " " + key;
                list.add(result);
            } );
            return list;
        }
    }
    static class Solver1 {
        public List<String> subdomainVisits(String[] cpdomains) {
            List<String> list = new ArrayList<>();
            int n = cpdomains.length;
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0; i < n; i++) {
                int countDomain = 0;
                int m = cpdomains[i].length();
                String subdomain = cpdomains[i];
                for(int j = 0; j < m; j++) {
                    if(subdomain.charAt(j) == ' ') {
                        countDomain = Integer.parseInt(subdomain.substring(0, j));
                        String link = subdomain.substring(j + 1);
                        map.put(link, map.getOrDefault(link, 0) + countDomain);
                    }
                    if(subdomain.charAt(j) == '.') {
                        String link = subdomain.substring(j + 1);
                        map.put(link, map.getOrDefault(link, 0) + countDomain);
                    }
                }
            }
            map.forEach( (key, value) -> {
                String result = value + " " + key;
                list.add(result);
            } );
            return list;
        }
    }
}
