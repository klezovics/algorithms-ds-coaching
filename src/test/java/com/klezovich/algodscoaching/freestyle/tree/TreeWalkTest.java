package com.klezovich.algodscoaching.freestyle.tree;

import com.klezovich.algodscoaching.patterns.tree.TreeMother;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.*;

class TreeWalkTest {

    private TreeWalk treeWalk = new TreeWalk();


    @Test
    void testInOrderTraversal() {
        var root = TreeMother.get01234Tree();
        var walk = treeWalk.printInOrder(root);

        assertThat(walk, contains(3,1,4,0,2));
    }

    @Test
    void testPreOrderTraversal() {
        var root = TreeMother.get01234Tree();
        var walk = treeWalk.printPreOrder(root);

        assertThat(walk, contains(0,1,3,4,2));
    }

    @Test
    void testPostOrderTraversal() {
        var root = TreeMother.get01234Tree();
        var walk = treeWalk.printPostOrder(root);

        assertThat(walk, contains(3,4,1,2,0));
    }
}