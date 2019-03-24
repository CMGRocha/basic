package com.basic.graph.depthfirstsearch.neighbourslist;

public class Main {

    public static void main(String[] args) {
        recursiveExample();
        iterativeExample();
    }

    private static void iterativeExample() {
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

        DepthFirstSearch dfs_neighbourList = new DepthFirstSearch();
        System.out.println("DFS with NeighbourList traversal using ITERATION ");
        dfs_neighbourList.dfs_iterativeWithStack(node0);
        System.out.println();
    }

    private static void recursiveExample() {
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

        DepthFirstSearch dfs_neighbourList = new DepthFirstSearch();
        System.out.println("DFS with NeighbourList traversal using RECURSION ");
        dfs_neighbourList.dfs_recursive(node0);
        System.out.println();
    }
}
