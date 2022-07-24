package com.zakcorp.leetcodemaster.contest;

import java.util.*;

public class Problem_C {
    static class Food {
        String name;
        int rating;
        String cuisine;
        public Food(String name, int rating, String cuisine) {
            this.name = name;
            this.rating = rating;
            this.cuisine = cuisine;
        }
    }
    static class FoodRatings {
        private final Map<String, PriorityQueue<Food>> map;
        private final Map<String, Food> menu;
        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            map = new HashMap<>();
            menu = new HashMap<>();
            for(int i = 0; i < foods.length; i++) {
                if(!map.containsKey( cuisines[i])) {
                    PriorityQueue<Food> pq = new PriorityQueue<>( new SortByValuesThenByKeyComparator() );
                    map.put(cuisines[i], pq);
                }
                PriorityQueue<Food> pq = map.get(cuisines[i]);
                Food curr = new Food(foods[i], ratings[i], cuisines[i]);
                pq.add(curr);
                menu.put(foods[i], curr);
            }
        }

        public void changeRating(String food, int newRating) {
            Food curr = menu.get(food);
            PriorityQueue<Food> pq = map.get(curr.cuisine);
            pq.remove(curr);
            curr.rating = newRating;
            pq.add(curr);
        }

        public String highestRated(String cuisine) {
            return map.get(cuisine).peek().name;
        }

        /*
        If two entries have different values, then the comparator -> will sort based on descending order of values.
        If two entries have same values, then the comparator -> will sort based on ascending order of keys.
         */
        static class SortByValuesThenByKeyComparator implements Comparator<Food> {
            @Override
            public int compare(Food f1, Food f2) {
                return f1.rating == f2.rating ? f1.name.compareTo(f2.name) : f2.rating - f1.rating;
            }
        }
    }
}
