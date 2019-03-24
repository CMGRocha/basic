package com.basic.graph.depthfirstsearch.adjacencymatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@SuppressWarnings("Duplicates")
public class DepthFirstSearch {
    private List<Node> nodes;

    public DepthFirstSearch(final List<Node> nodes) {
        this.nodes = nodes;
    }

    private ArrayList<Node> findNeighbours(int[][] adjacency_matrix, final Node node) {
        int nodeIndex = -1;
        ArrayList<Node> neighbours = new ArrayList<>();
        for (int x = 0; x < nodes.size(); x++) {
            if (nodes.get(x).equals(node)) {
                nodeIndex = x;
                break;
            }
        }
        if (nodeIndex != -1) {
            for (int y = 0; y < adjacency_matrix[nodeIndex].length; y++) {
                if (adjacency_matrix[nodeIndex][y] == 1) {
                    neighbours.add(nodes.get(y));
                }
            }
        }
        return neighbours;
    }

    public void dfs_recursive(int adjacency_matrix[][], final Node node) {
        System.out.print(node.getData() + "\t");
        ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, node);
        node.setVisited(true);
        for (int x = 0; x < neighbours.size(); x++) {
            Node n = neighbours.get(x);
            if (n != null && !n.isVisited()) {
                dfs_recursive(adjacency_matrix, n);
            }
        }
    }

    public void dfs_iterativeWithStack(int adjacency_matrix[][], final Node node) {
        Stack<Node> stack = new Stack<>();
        stack.add(node);
        node.setVisited(true);
        while (!stack.isEmpty()) {
            Node element = stack.pop();
            System.out.print(element.getData() + "\t");
            ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, element);
            for (int x = 0; x < neighbours.size(); x++) {
                Node n = neighbours.get(x);
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                    n.setVisited(true);
                }
            }
        }
    }
}
