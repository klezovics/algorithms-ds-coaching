package com.klezovich.algodscoaching.patterns.tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
