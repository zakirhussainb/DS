package com.zakcorp.techiedelight.binarytree;

import org.junit.jupiter.api.*;

public class Test_Problem_1 {
    @Test
    public void testSolverRecursive(){
        Solver.Recursive recursive = new Solver.Recursive();
        Problem_1 problem = new Problem_1();
        Solver.Node x = problem.dataGeneration();
        Solver.Node y = problem.dataGeneration();
        Assertions.assertTrue(recursive.isIdentical(x, y));
    }
    @Test
    public void testSolverIterative(){
        Solver.Iterative iterative = new Solver.Iterative();
        Problem_1 problem = new Problem_1();
        Solver.Node x = problem.dataGeneration();
        Solver.Node y = problem.dataGeneration();
        Assertions.assertTrue(iterative.isIdentical(x, y));
    }
}
