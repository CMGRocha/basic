package com.basic.graph.depthfirstsearch.adjacencymatrix;

public class Node {
    private int data;
    private boolean visited;

    public Node(int data) {
        this.data = data;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
