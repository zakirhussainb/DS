package com.zakcorp.leetcodemaster;

public class Problem_2105
{
    static class Solver {
        public int solve1(int[] plants, int capacityA, int capacityB) {
            int a = 0, b = plants.length - 1;
            int initialCapA = capacityA;
            int initialCapB = capacityB;
            int[] refill = {0};
            while(a <= b) {
                if(a == b) {
                    if(capacityA >= capacityB) {
                        capacityA = fillWater( capacityA, plants, a, refill, initialCapA );
                    } else {
                        capacityB = fillWater( capacityB, plants, b, refill, initialCapB );
                    }
                } else {
                    capacityA = fillWater( capacityA, plants, a, refill, initialCapA );
                    capacityB = fillWater( capacityB, plants, b, refill, initialCapB );
                }
                a++;
                b--;
            }
            return refill[0];
        }
        private int fillWater(int capacity, int[] plants, int ps, int[] refill, int initialCap) {
            if (capacity < plants[ ps] ) {
                refill[0]++;
                capacity = initialCap;
            }
            capacity -= plants[ps];
            return capacity;
        }
    }
}
