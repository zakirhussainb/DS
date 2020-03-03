package com.zakcorp.techiedelight.binarytree;

import org.junit.jupiter.api.*;

public class Test_Problem_1 {
    @Test
    public void testSolverRecursive(){
        Problem_1.Solver.Recursive recursive = new Problem_1.Solver.Recursive();
        Problem_1 problem = new Problem_1();
        Problem_1.Solver.Node x = problem.dataGeneration();
        Problem_1.Solver.Node y = problem.dataGeneration();
        Assertions.assertTrue(recursive.isIdentical(x, y));
    }
    @Test
    public void testSolverIterative(){
        Problem_1.Solver.Iterative iterative = new Problem_1.Solver.Iterative();
        Problem_1 problem = new Problem_1();
        Problem_1.Solver.Node x = problem.dataGeneration();
        Problem_1.Solver.Node y = problem.dataGeneration();
        Assertions.assertTrue(iterative.isIdentical(x, y));
    }
}
