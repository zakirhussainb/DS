package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_925 {
    static class Solver {
        public boolean isLongPressedName(String name, String typed) {
            int m = name.length(); int n = typed.length();
            if(n < m) return false;
            int i = 0, j = 0;
            while(i < m && j < n) {
                char nameCh = name.charAt(i);
                char typedCh = typed.charAt(j);
                if(nameCh != typedCh)
                    return false;
                int nameIndex = i + 1;
                int typedIndex = j + 1;
                while(nameIndex < m && nameCh == name.charAt(nameIndex))
                    nameIndex++;
                while(typedIndex < n && typedCh == typed.charAt(typedIndex))
                    typedIndex++;
                if( (typedIndex - j) < (nameIndex - i) )
                    return false;
                i = nameIndex;
                j = typedIndex;
            }
            return i >= m && j >= n;
        }
    }
}
