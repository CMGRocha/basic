package com.basic.graph.breadthfirstsearch.neighbourslist;

public class Main {
    public static void main(String[] args) {
        Node node0 = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node0.addNeighbours(node0);
        node0.addNeighbours(node1);
        node0.addNeighbours(node2);
        node1.addNeighbours(node3);
        node1.addNeighbours(node4);
        node2.addNeighbours(node5);

        BreadthFirstSearch dfs_neighbourList = new BreadthFirstSearch();
        System.out.println("BFS with NeighbourList traversal using ITERATION ");
        dfs_neighbourList.bfs_iterativeWithQueue(node0);
        System.out.println();
    }
}
