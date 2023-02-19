package com.zakcorp.leetcodemaster;

import java.util.*;

public class Problem_1861
{
    static class Solver {
        public char[][] solve1(char[][] box) {
            int rL = box.length;
            int cL = box[0].length;
            char[][] res = new char[cL][rL];
            char prevCh = ' ';
            LinkedList<LinkedList<Character>> ll = new LinkedList<>();
            for(int r = 0; r < rL; r++) {
                LinkedList<Character> list = new LinkedList<>();
                for(int c = cL - 1; c >= 0; c--) {
                    char currCh = box[r][c];
                    if(currCh == '.') {
                        list.addFirst(currCh);
                    } else if(currCh == '*') {
                        list.addFirst(currCh);
                    } else if(currCh == '#') {
                        if(prevCh != '.') {
                            list.addFirst( currCh );
                        }
                        while(prevCh == '.') {
                            list.removeFirst();
                            list.addFirst( currCh );
                            list.addFirst( prevCh );
                            prevCh = currCh;
                        }
                    }
                    prevCh = currCh;
                }
//                while(list.size() < res.length) {
//                    list.addFirst( '.' );
//                }
                ll.add(0, list);
            }
            for(int i = 0; i < ll.get( 0 ).size(); i++) {
                for(int j = 0; j < ll.size(); j++) {
                    res[i][j] = ll.get( j ).get( i );
                }
            }
            return res;
        }
    }
}
