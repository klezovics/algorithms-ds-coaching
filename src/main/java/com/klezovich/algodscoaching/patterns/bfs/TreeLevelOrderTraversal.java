package com.klezovich.algodscoaching.patterns.bfs;

import com.klezovich.algodscoaching.patterns.tree.TreeNode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class TreeLevelOrderTraversal {

    public static List<List<Integer>> getLevelOrderTraversal(TreeNode root) {

        if(Objects.isNull(root)) {
            return List.of();
        }

        var levels = new ArrayList<List<Integer>>();

        var nodesToVisit = (Queue<NodeAndLevel>) new ArrayDeque<NodeAndLevel>();

        //OK, so here's the key aspect of the solution.
        //When we add the node to the nodesToVisit list we also store its level
        nodesToVisit.add(new NodeAndLevel(root, 0));

        while (!nodesToVisit.isEmpty()) {
            var nextNodeToVisit = nodesToVisit.poll();

            //Check if we have a list for the current level
            //If not add it

            int nodeLevel = nextNodeToVisit.getLevel();
            if(levels.size() - 1 < nodeLevel) {
                levels.add(new ArrayList<>());
            }

            levels.get(nodeLevel).add(nextNodeToVisit.getNode().getVal());

            var left = nextNodeToVisit.getNode().getLeft();
            var right = nextNodeToVisit.getNode().getRight();

            if(left != null) {
                nodesToVisit.add(new NodeAndLevel(left,nodeLevel+1));
            }

            if(right != null) {
                nodesToVisit.add(new NodeAndLevel(right,nodeLevel+1));
            }
        }

        return levels;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class NodeAndLevel {
        private TreeNode node;
        private int level;
    }

}
