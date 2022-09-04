package com.zakcorp.leetcodemaster;

import java.util.*;
import java.util.stream.Collectors;

public class Problem_1333
{
    static class Solver {
        static class Restaurant {
            int id;
            int rating;
            int vF;
            int price;
            int distance;

            public Restaurant( int id, int rating, int vF, int price, int distance )
            {
                this.id = id;
                this.rating = rating;
                this.vF = vF;
                this.price = price;
                this.distance = distance;
            }
        }
        public List<Integer> solve1( int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
            List<Restaurant> list = new ArrayList<>();
            for(int[] res : restaurants) {
                if(veganFriendly == 1) {
                    if(res[2] == veganFriendly && res[3] <= maxPrice && res[4] <= maxDistance) {
                        list.add(new Restaurant( res[0], res[1], res[2], res[3], res[4] ));
                    }
                } else {
                    if(res[3] <= maxPrice && res[4] <= maxDistance) {
                        list.add(new Restaurant( res[0], res[1], res[2], res[3], res[4] ));
                    }
                }
            }
            List<Restaurant> result = list.stream()
                .sorted((l1, l2) -> l1.rating == l2.rating ? l2.id - l1.id : l2.rating - l1.rating)
                .collect( Collectors.toList());
            List<Integer> ans = new ArrayList<>();
            for(Restaurant r : result) {
                ans.add( r.id );
            }
            return ans;
        }
    }
}
