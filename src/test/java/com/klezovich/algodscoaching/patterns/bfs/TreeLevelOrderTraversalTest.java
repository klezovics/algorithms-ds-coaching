package com.klezovich.algodscoaching.patterns.bfs;

import com.klezovich.algodscoaching.patterns.tree.TreeMother;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.*;

class TreeLevelOrderTraversalTest {

    @Test
    void testTraversalNullTree() {
        var levels = TreeLevelOrderTraversal.getLevelOrderTraversal(null);
        assertEquals(0, levels.size());
    }

    @Test
    void testTraversalRootOnly() {
        var levels = TreeLevelOrderTraversal.getLevelOrderTraversal(TreeMother.getTreeWithHeight1());
        assertEquals(1, levels.size());
        assertThat(levels.get(0), contains(0));
    }

    @Test
    void testTraversalRealTree() {
        var levels = TreeLevelOrderTraversal.getLevelOrderTraversal(TreeMother.get01234Tree());
        assertEquals(3, levels.size());
        assertThat(levels.get(0), contains(0));
        assertThat(levels.get(1), contains(1,2));
        assertThat(levels.get(2), contains(3,4));
    }
}