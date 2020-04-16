package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_804 {
    static class Solver {
        public int uniqueMorseRepresentations_approach2(String[] words) {
            final String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                    "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--",
                    "-..-","-.--","--.."};
            Set<String> set = new HashSet<>();
            for(String word : words) {
                StringBuilder sb = new StringBuilder();
                for(Character ch : word.toCharArray()) {
                    sb.append(MORSE[ch - 'a']);
                }
                set.add(sb.toString());
            }
            return set.size();
        }
        public int uniqueMorseRepresentations_approach1(String [] words) {
            Set<String> set = new HashSet<>();
            for(String word : words) {
                StringBuilder str = new StringBuilder();
                for(Character ch : word.toCharArray()) {
                    str.append(getMorseCode(ch));
                }
                set.add(str.toString());
            }
            return set.size();
        }
        public String getMorseCode(Character ch) {
            Map<Character, String> map = new HashMap<>();
            map.put('a',".-");
            map.put('b',"-...");
            map.put('c',"-.-.");
            map.put('d',"-..");
            map.put('e',".");
            map.put('f',"..-.");
            map.put('g',"--.");
            map.put('h',"....");
            map.put('i',"..");
            map.put('j',".---");
            map.put('k',"-.-");
            map.put('l',".-..");
            map.put('m',"--");
            map.put('n',"-.");
            map.put('o',"---");
            map.put('p',".--.");
            map.put('q',"--.-");
            map.put('r',".-.");
            map.put('s',"...");
            map.put('t',"-");
            map.put('u',"..-");
            map.put('v',"...-");
            map.put('w',".--");
            map.put('x',"-..-");
            map.put('y',"-.--");
            map.put('z',"--..");
            return map.get(ch);
        }
    }
}
