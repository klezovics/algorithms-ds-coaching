package com.klezovich.algodscoaching.freestyle.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphList {

    private int size;
    private List<List<Integer>> adjancencyList;

    public GraphList(int size) {
        this.size = size;
        this.adjancencyList = new ArrayList<>();
        for(int ii=0;ii<size;ii++) {
           adjancencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int from, int to) {
        adjancencyList.get(from).add(to);
        adjancencyList.get(to).add(from);
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for(int vertex=0;vertex<size; vertex++ ) {
            sb.append(vertex+":");
            for(var neighbourVertex : adjancencyList.get(vertex)) {
                sb.append(neighbourVertex+" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var graph = new GraphList(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);

        System.out.println(graph);
    }
}
