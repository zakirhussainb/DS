package com.zakcorp.leetcodemaster;
import java.util.*;
public class Problem_500 {
    static class Solver {
        public String[] findWords(String[] words) {
            String[] keys = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < keys.length; i++) {
                for(char ch : keys[i].toCharArray()) {
                    map.put(ch, i);
                }
            }
            List<String> result = new LinkedList<>();
            for(String w : words) {
                if(w.equals(""))
                    continue;
                int index = map.get(w.toUpperCase().charAt(0));
                for(char c: w.toUpperCase().toCharArray()){
                    if(map.get(c)!=index){
                        index = -1; //don't need a boolean flag.
                        break;
                    }
                }
                if(index!=-1) result.add(w);//if index != -1, this is a valid string
            }
            return result.toArray(new String[0]);
        }
    }
}
