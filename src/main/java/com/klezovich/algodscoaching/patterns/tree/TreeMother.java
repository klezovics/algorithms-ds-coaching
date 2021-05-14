package com.klezovich.algodscoaching.patterns.tree;

public class TreeMother {

    public static TreeNode get01234Tree() {

        var root = new TreeNode(0);
        var level1Left = new TreeNode(1);
        var level1Right = new TreeNode(2);

        var level2Left = new TreeNode(3);
        var level2Right = new TreeNode(4);

        root.setLeft(level1Left);
        root.setRight(level1Right);

        level1Left.setLeft(level2Left);
        level1Left.setRight(level2Right);

        return root;
    }

    public static TreeNode getTreeWithHeight1() {
        var root = new TreeNode(0);
        return root;
    }
}
