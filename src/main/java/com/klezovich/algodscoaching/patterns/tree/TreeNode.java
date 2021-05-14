package com.klezovich.algodscoaching.patterns.tree;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
