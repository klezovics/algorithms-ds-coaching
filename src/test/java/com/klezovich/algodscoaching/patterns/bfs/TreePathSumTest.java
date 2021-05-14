package com.klezovich.algodscoaching.patterns.bfs;

import com.klezovich.algodscoaching.patterns.dfs.TreePathSum;
import com.klezovich.algodscoaching.patterns.tree.TreeMother;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreePathSumTest {

    @Test
    void testTreeDepth1() {
        assertTrue(TreePathSum.hasPath(TreeMother.getTreeWithHeight1(),0));
    }

    @Test
    void testDeepTree() {
        assertTrue(TreePathSum.hasPath(TreeMother.get01234Tree(),4));
        assertTrue(TreePathSum.hasPath(TreeMother.get01234Tree(),5));
        assertFalse(TreePathSum.hasPath(TreeMother.get01234Tree(),50));
    }

}