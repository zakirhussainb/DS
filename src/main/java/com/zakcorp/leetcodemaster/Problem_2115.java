package com.zakcorp.leetcodemaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_2115 {
    static class Solver {
        enum Status {
            NOT_COOKED,
            COOKING,
            COOKED
        }

        public List<String> solve1(String[] recipes, List<List<String>> ingredients, String[] supplies) {
            Map<String, List<String>> recipeToIngredientGraph = new HashMap<>();
            Map<String, Status> status = new HashMap<>();
            for (int i = 0; i < recipes.length; i++) {
                status.put(recipes[i], Status.NOT_COOKED);
                recipeToIngredientGraph.put(recipes[i], ingredients.get(i));
            }
            for (String supply : supplies)
                status.put(supply, Status.COOKED);

            List<String> output = new ArrayList<>();
            for (String s : recipes) {
                dfs(s, recipeToIngredientGraph, status, output);
            }
            return output;
        }

        private boolean dfs(String src, Map<String, List<String>> recipeToIngredientGraph, Map<String, Status> status,
                            List<String> output) {
            if (!status.containsKey(src))
                return false;
            if (status.get(src) == Status.COOKING)
                return false;
            if (status.get(src) == Status.COOKED)
                return true;

            status.put(src, Status.COOKING);
            for (String m : recipeToIngredientGraph.get(src)) {
                if ( !dfs(m, recipeToIngredientGraph, status, output) ) {
                    return false;
                }
            }
            status.put(src, Status.COOKED);
            output.add(src);
            return true;
        }
    }
}
