package com.basic.graph.breadthfirstsearch.adjacencymatrix;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Main {

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        nodes.add(node0);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        nodes.add(node4);
        nodes.add(node5);

        int adjacency_matrix[][] = {
                {0, 1, 1, 0, 0, 0},  // Node 0
                {1, 0, 0, 1, 1, 0},  // Node 1
                {1, 0, 0, 0, 0, 1},  // Node 2
                {0, 1, 0, 0, 0, 0},  // Node 3
                {0, 1, 0, 0, 0, 0},  // Node 4
                {0, 0, 1, 0, 0, 0}  // Node 5
        };

        BreadthFirstSearch dfs_neighbourList = new BreadthFirstSearch(nodes);
        System.out.println("BFS with Adjacent Matrix traversal using Iteration With Queue ");
        dfs_neighbourList.bfs(adjacency_matrix, node0);
        System.out.println();
    }
}
