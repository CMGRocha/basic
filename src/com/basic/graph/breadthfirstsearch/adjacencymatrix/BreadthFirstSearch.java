package com.basic.graph.breadthfirstsearch.adjacencymatrix;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("Duplicates")
public class BreadthFirstSearch {
    private Queue<Node> queue;
    private List<Node> nodes;

    public BreadthFirstSearch(List<Node> nodes) {
        this.nodes = nodes;
        queue = new LinkedList<>();
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

    public void bfs(int[][] adjacency_matrix, final Node node) {
        queue.add(node);
        node.setVisited(true);
        while (!queue.isEmpty()) {
            Node element = queue.remove();
            System.out.print(element.getData() + "\t");
            ArrayList<Node> neighbours = findNeighbours(adjacency_matrix, element);
            for (int x = 0; x < neighbours.size(); x++) {
                Node n = neighbours.get(x);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }
}
