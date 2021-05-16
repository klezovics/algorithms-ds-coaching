package com.klezovich.algodscoaching.freestyle.graph;

public class GraphMatrix {

    private int size;
    private int[][] adjacencyMatrix;

    public GraphMatrix(int size) {
        this.size = size;
        this.adjacencyMatrix = new int[size][size];
    }

    public void addEdge(int from, int to) {
        adjacencyMatrix[from][to]=1;
        adjacencyMatrix[to][from]=1;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        for(int row=0;row<size; row++ ) {
            for(int column=0; column< size; column++) {
                sb.append(adjacencyMatrix[row][column]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var graph = new GraphMatrix(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);

        System.out.println(graph);
    }
}
