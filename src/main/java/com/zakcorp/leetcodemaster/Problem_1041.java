package com.zakcorp.leetcodemaster;

public class Problem_1041 {
    static class Solver {
        public boolean solve1(String instructions) {
            int[] initial = {0, 0};
            int n = instructions.length();
            char currentDirection = 'N';
            for(int i = 0; i < n; i++) {
                if(instructions.charAt(i) == 'G') {
                    switch ( currentDirection ) {
                        case 'N':
                            initial[1] += 1;
                            break;
                        case 'S':
                            initial[1] -= 1;
                            break;
                        case 'E':
                            initial[0] += 1;
                            break;
                        case 'W':
                            initial[0] -= 1;
                            break;
                    }
                } else if(instructions.charAt( i ) == 'L') {
                    switch ( currentDirection ) {
                        case 'N':
                            currentDirection = 'W';
                            break;
                        case 'W':
                            currentDirection = 'S';
                            break;
                        case 'S':
                            currentDirection = 'E';
                            break;
                        case 'E':
                            currentDirection = 'N';
                            break;
                    }
                } else {
                    switch ( currentDirection ) {
                        case 'N':
                            currentDirection = 'E';
                            break;
                        case 'W':
                            currentDirection = 'N';
                            break;
                        case 'S':
                            currentDirection = 'W';
                            break;
                        case 'E':
                            currentDirection = 'S';
                            break;
                    }
                }
            }
            return initial[0] ==0 && initial[1] == 0 || currentDirection != 'N';
        }
    }
}
