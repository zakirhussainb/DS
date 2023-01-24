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

    static class Solver1 {
        public boolean solve1(String instructions) {
            // we know that robot can move in 4 direction's
            int[][] dir = new int[][]{ {0, 1}, {-1, 0}, {0, -1}, {1, 0} }; // Up[North], Left[West], Down[South], Right[East]
            int index = 0; // we have to keep tracking those cases where it's not rotating.
            // if in the end of execution, we see it's not rotating we will gonna return false;
            int x = 0, y = 0; // it's origin

            // let's write an for loop & iterate through the instructions. So, we keep 1 instructions at a time.
            // And we will keep checking the position of the robot after executing particular instruction.
            for(char ch : instructions.toCharArray()) {
                // Now, we are checking is it a rotation
                if(ch == 'L') { // If it's left then update it's head rotation
                    index = (index + 1) % 4;
                } else if(ch == 'R') {  // If it's right then update it's head rotation
                    index = (index + 3) % 4;
                } else { // We are checking it's direction
                    x += dir[index][0];
                    y += dir[index][1];
                }
            }
            // LAST EDIT : for (x == 0 && y == 0) We are checking is our initial position from where we started and end position where we are finishing both are same!
            // If so,  return true;

            // If the robot perform 1 rotation, it means  "i != 0" then it will guaranteed perform a circle & after certain rotation it will come back to the origin.
            // But if "i is  0" , it mean's robot is moving straight, hence there is no cycle. It will never come back to origin.
            return x == 0 && y == 0 || index != 0;
        }
    }
}
