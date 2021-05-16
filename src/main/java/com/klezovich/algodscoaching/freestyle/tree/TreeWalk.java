package com.klezovich.algodscoaching.freestyle.tree;

import com.klezovich.algodscoaching.patterns.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreeWalk {

    private List<Integer> nodeValues;

    //In order print (L,Root,Right)
    public List<Integer> printInOrder(TreeNode root) {
       nodeValues = new ArrayList<>();
       printInOrderInternal(root);
       return nodeValues;
    }

    //Preorder is (Root, L, R)
    public List<Integer> printPreOrder(TreeNode root) {
        nodeValues = new ArrayList<>();
        printPreOrderInternal(root);
        return nodeValues;
    }

    //PostOrder is (L,R,Root)
    public List<Integer> printPostOrder(TreeNode root) {
        nodeValues = new ArrayList<>();
        printPostOrderInternal(root);
        return nodeValues;
    }

    private void printPostOrderInternal(TreeNode root) {
        if(root == null) {
            return;
        }

        printPostOrderInternal(root.left);
        printPostOrderInternal(root.right);
        nodeValues.add(root.val);
    }

    private void printPreOrderInternal(TreeNode root) {
        if(root == null) {
            return;
        }

        nodeValues.add(root.val);
        printPreOrderInternal(root.left);
        printPreOrderInternal(root.right);
    }

    private void printInOrderInternal(TreeNode root) {
        if(root == null) {
            return;
        }

        printInOrderInternal(root.left);
        nodeValues.add(root.val);
        printInOrderInternal(root.right);
    }

}
