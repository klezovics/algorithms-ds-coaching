package com.klezovich.algodscoaching.freestyle.graph;

public class GraphDfsWalker {

    //We need to know the graph we are traversing
    //Without it, we can't solve the problem
    private GraphList graph;

    //We need to keep track of nodes we have already visited
    private boolean[] visited;

    public GraphDfsWalker(GraphList graph) {
        this.graph = graph;
        this.visited = new boolean[graph.getSize()];
    }

    void dfs(int nodeNumber) {

        //If a node was already visited - don't visit it again
        //Prevents us from walking in cycles along a graph
        if(visited[nodeNumber]) {
            return;
        }

        //If its not visited - visit it
        visited[nodeNumber] = true;

        System.out.println("Visiting node :" + nodeNumber);

        //OK. Once this is done, continue visiting its children
        for(int next : graph.getNeighbours(nodeNumber)) {
            dfs(next);
        }
    }

    public static void main(String[] args) {
        var graph = GraphList.get01234Graph();
        var dfsWalker = new GraphDfsWalker(graph);

        dfsWalker.dfs(0);
    }
}
