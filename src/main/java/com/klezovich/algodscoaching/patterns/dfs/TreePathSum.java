package com.klezovich.algodscoaching.patterns.dfs;

import com.klezovich.algodscoaching.patterns.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Stack;

public class TreePathSum {

  public static boolean hasPath(TreeNode root, int sum) {

    if(root == null) {
      return false;
    }

    Stack<NodeAndSumToRoot> nodesToVisit = new Stack<NodeAndSumToRoot>();
    nodesToVisit.push(new NodeAndSumToRoot(root, 0));

    while (!nodesToVisit.isEmpty()) {
      NodeAndSumToRoot node = nodesToVisit.pop();
      int nodeVal = node.node.val;
      int sumToRoot = node.sumToRoot;

      //We have found a good leaf - return
      if(node.node.left == null && node.node.right == null) {
         if(nodeVal+sumToRoot == sum) {
           return true;
         }
      }

      TreeNode left = node.node.getLeft();
      TreeNode right = node.node.getRight();

      if(left != null) {
         nodesToVisit.push(new NodeAndSumToRoot(left, sumToRoot+ nodeVal));
      }

      if(right != null) {
        nodesToVisit.push(new NodeAndSumToRoot(right, sumToRoot+ nodeVal));
      }
    }

    return false;
  }

  static class NodeAndSumToRoot {
     TreeNode node;
     int sumToRoot;

    public NodeAndSumToRoot(TreeNode node, int sumToRoot) {
      this.node = node;
      this.sumToRoot = sumToRoot;
    }
  }
}