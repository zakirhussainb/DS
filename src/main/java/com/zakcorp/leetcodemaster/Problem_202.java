package com.zakcorp.leetcodemaster;

public class Problem_202 {
    static class Solver {
        public boolean isHappy_recursive(int n) {
            if(n == 1 || n == 7) {
                return true;
            } else if(n < 10) {
                return false;
            }
            int sum = 0;
            while(n > 0) {
                int temp = n % 10;
                sum = sum + (temp * temp);
                n = n / 10;
            }
            return isHappy_recursive(sum);
        }
        public boolean isHappy_FloydCycleDetection(int n){
            int slow = n;
            int fast = n;
            do {
                slow = calculateSquare(slow);
                fast = calculateSquare(calculateSquare(fast));
            }while (slow != fast);
            return slow == 1;
        }
        public int calculateSquare(int n) {
            int squareSum = 0;
            while(n > 0) {
                int temp = n % 10;
                squareSum = squareSum + (temp * temp);
                n = n / 10;
            }
            return squareSum;
        }
    }
}
